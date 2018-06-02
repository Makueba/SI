package bd.runner;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * bd.runner.QR02 is a Querydsl Projection type for R02
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QR02 extends ConstructorExpression<R02> {

    private static final long serialVersionUID = -1392173246L;

    public QR02(com.querydsl.core.types.Expression<String> nome, com.querydsl.core.types.Expression<String> cpf) {
        super(R02.class, new Class<?>[]{String.class, String.class}, nome, cpf);
    }

}

