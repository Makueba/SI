package bd.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Materia.class)
public abstract class Materia_ {

	public static volatile SingularAttribute<Materia, String> codigo;
	public static volatile SingularAttribute<Materia, String> nome;
	public static volatile ListAttribute<Materia, Materia> preRequisitos;

}

