package bd.runner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

import bd.entity.PessoaFisica;
import bd.entity.PessoaFisica_;
import bd.entity.QPessoaFisica;
import bd.runner.QR02;
@Component
public class Q02 implements CommandLineRunner {
  @Autowired
  private EntityManager em;
  @Autowired
  private DataSource ds;
  @Override
  public void run(String... args) throws Exception {
  }
  
  void sql() throws Exception{
	  Connection connection = ds.getConnection();
	  List<R02> result = new ArrayList<>();
	  String sql = "select p.tx_nome as nome, pf.tx_cpf as cpf "
	  		+ "from tb_pessoa p join tb_pessoa_fisica pf on p.id = pf.id "
	  		+ "where p.tx_nome like 'a%' "
	  		+ "or (p.tx_nome like '%o') "
	  		+ "or (p.tx_nome like '%i%')";
	  try(PreparedStatement ps = connection.prepareStatement(sql)){
		  ResultSet resultSet = ps.executeQuery();
		  while(resultSet.next()) {
			  result.add(new R02(resultSet.getString("nome"), resultSet.getString("cpf")));
		  }
		  System.out.println("sql");
		  result.forEach(System.out::println);
	  }
  }
  
  void jpql() throws Exception{
	  String jpql = "select new bd.runner.R02(p.nome, p.cpf) "
	  		+ "from PessoaFisica p "
	  		+ "where p.nome like 'a%' "
	  		+ "or (p.nome like '%o') "
	  		+ "or (p.nome like '%i%')";
	  System.out.println("jpql");
	  em.createQuery(jpql, R02.class).getResultList().forEach(System.out::println);
  }
  
  void criteria() throws Exception{
	  CriteriaBuilder cb = em.getCriteriaBuilder();
	  CriteriaQuery<R02> cq = cb.createQuery(R02.class);
	  Root<PessoaFisica> p = cq.from(PessoaFisica.class);
	  cq.multiselect(p.get(PessoaFisica_.nome), p.get(PessoaFisica_.cpf));
	  Predicate p1 = cb.like(p.get(PessoaFisica_.nome), "a%");
	  Predicate p2 = cb.like(p.get(PessoaFisica_.nome), "%o");
	  Predicate p3 = cb.like(p.get(PessoaFisica_.nome), "%i%");
	  cq.where(cb.or(p1, p2, p3));
	  
	  
	  System.out.println("criteria");
	  em.createQuery(cq).getResultList().forEach(System.out::println);
  }
  
  void queryDSL() throws Exception{
	  QPessoaFisica p = QPessoaFisica.pessoaFisica;
	  System.out.println("QueryDSL");
	  new JPAQueryFactory(em)
	  .select(new QR02(p.nome, p.cpf))
	  .from(p)
	  .where(p.nome.like("a%").or(p.nome.like("%o")).or(p.nome.like("%i%")))
	  .fetch()
	  .forEach(System.out::println);
  }
}
