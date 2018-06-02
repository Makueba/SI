package bd.runner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

import bd.entity.Curso;
import bd.runner.QR01;
@Component
public class Q01 implements CommandLineRunner {
  @Autowired
  private EntityManager em;
  @Autowired
  private DataSource ds;
  @Override
  public void run(String... args) throws Exception {
  }
  
  void sql() throws Exception{
	  Connection connection = ds.getConnection();
	  List<R01> result = new ArrayList<>();
	  String sql = "select p.nu_numero as numero, p.tx_nome as nome, pe.tx_nome candidato "
	  		+ "from tb_partido p "
	  		+ "left join tb_pessoa_fisica pf on p.id_candidato = pf.id "
	  		+ "left join tb_pessoa pe on pf.id = pe.id "
	  		+ "where p.nu_numero = 13 "
	  		+ "or (p.nu_numero between 15 and 20) "
	  		+ "or (p.nu_numero > 40)";
	  try(PreparedStatement ps = connection.prepareStatement(sql)){
		  ResultSet resultSet = ps.executeQuery();
		  while(resultSet.next()) {
			  result.add(new R01(resultSet.getString("nome"), resultSet.getInt("numero"), resultSet.getString("candidato")));
		  }
		  System.out.println("sql");
		  result.forEach(System.out::println);
	  }
  }
  
  void jpql() throws Exception{
	  String jpql = "select new bd.runner.R01(p.nome, p.numero, c.nome) "
	  		+ "from Partido p "
	  		+ "left join p.candidato c "
	  		+ "where p.numero = 13 "
	  		+ "or (p.numero between 15 and 20) "
	  		+ "or (p.numero > 40)";
	  System.out.println("jpql");
	  em.createQuery(jpql, R01.class).getResultList().forEach(System.out::println);
  }
  
  void criteria() throws Exception{
	  CriteriaBuilder cb = em.getCriteriaBuilder();
	  CriteriaQuery<R01> cq = cb.createQuery(R01.class);
	  Root<Curso> p = cq.from(Curso.class);
	  Join<Curso, PessoaFisica> j = p.join(Partido_.candidato);
	  cq.multiselect(p.get(Partido_.nome), p.get(Partido_.numero), j.get(PessoaFisica_.nome));
	  Predicate p1 = cb.equal(p.get(Partido_.numero), 13);
	  Predicate p2 = cb.between(p.get(Partido_.numero), 15, 20);
	  Predicate p3 = cb.greaterThan(p.get(Partido_.numero), 40);
	  cq.where(cb.or(p1, p2, p3));
	  
	  
	  System.out.println("criteria");
	  em.createQuery(cq).getResultList().forEach(System.out::println);
  }
  
  void queryDSL() throws Exception{
	  QPartido p = QPartido.partido;
	  QPessoaFisica pe = QPessoaFisica.pessoaFisica;
	  System.out.println("QueryDSL");
	  new JPAQueryFactory(em)
	  .select(new QR01(p.nome, p.numero, pe.nome))
	  .from(p)
	  .leftJoin(p.candidato, pe)
	  .where(p.numero.eq(13).or(p.numero.between(15, 20)).or(p.numero.gt(40)))
	  .fetch()
	  .forEach(System.out::println);
  }
}
