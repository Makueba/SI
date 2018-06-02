package bd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCurso is a Querydsl query type for Curso
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCurso extends EntityPathBase<Curso> {

    private static final long serialVersionUID = 1713423581L;

    public static final QCurso curso = new QCurso("curso");

    public final StringPath codigo = createString("codigo");

    public final StringPath nome = createString("nome");

    public final ListPath<Materia, QMateria> obrigatorias = this.<Materia, QMateria>createList("obrigatorias", Materia.class, QMateria.class, PathInits.DIRECT2);

    public final ListPath<Materia, QMateria> optativas = this.<Materia, QMateria>createList("optativas", Materia.class, QMateria.class, PathInits.DIRECT2);

    public QCurso(String variable) {
        super(Curso.class, forVariable(variable));
    }

    public QCurso(Path<? extends Curso> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCurso(PathMetadata metadata) {
        super(Curso.class, metadata);
    }

}

