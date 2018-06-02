package bd.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> codigo;
	public static volatile ListAttribute<Curso, Materia> optativas;
	public static volatile SingularAttribute<Curso, String> nome;
	public static volatile ListAttribute<Curso, Materia> obrigatorias;

}

