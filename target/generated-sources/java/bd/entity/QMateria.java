package bd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMateria is a Querydsl query type for Materia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMateria extends EntityPathBase<Materia> {

    private static final long serialVersionUID = 1341542374L;

    public static final QMateria materia = new QMateria("materia");

    public final StringPath codigo = createString("codigo");

    public final NumberPath<Integer> creditos = createNumber("creditos", Integer.class);

    public final StringPath nome = createString("nome");

    public final ListPath<Materia, QMateria> preRequisitos = this.<Materia, QMateria>createList("preRequisitos", Materia.class, QMateria.class, PathInits.DIRECT2);

    public QMateria(String variable) {
        super(Materia.class, forVariable(variable));
    }

    public QMateria(Path<? extends Materia> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMateria(PathMetadata metadata) {
        super(Materia.class, metadata);
    }

}

