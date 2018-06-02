package bd.runner;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * bd.runner.QR01 is a Querydsl Projection type for R01
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QR01 extends ConstructorExpression<R01> {

    private static final long serialVersionUID = -1392173247L;

    public QR01(com.querydsl.core.types.Expression<String> nomePartido, com.querydsl.core.types.Expression<Integer> numeroPartido, com.querydsl.core.types.Expression<String> candidato) {
        super(R01.class, new Class<?>[]{String.class, int.class, String.class}, nomePartido, numeroPartido, candidato);
    }

}

