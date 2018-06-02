package bd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = 367766319L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final QCurso curso;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath login = createString("login");

    public final ListPath<Materia, QMateria> materias = this.<Materia, QMateria>createList("materias", Materia.class, QMateria.class, PathInits.DIRECT2);

    public final StringPath nome = createString("nome");

    public final StringPath semestre = createString("semestre");

    public final StringPath senha = createString("senha");

    public QUsuario(String variable) {
        this(Usuario.class, forVariable(variable), INITS);
    }

    public QUsuario(Path<? extends Usuario> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsuario(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsuario(PathMetadata metadata, PathInits inits) {
        this(Usuario.class, metadata, inits);
    }

    public QUsuario(Class<? extends Usuario> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.curso = inits.isInitialized("curso") ? new QCurso(forProperty("curso")) : null;
    }

}

