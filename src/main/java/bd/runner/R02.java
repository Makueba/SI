package bd.runner;
import java.io.Serializable;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Value;
@SuppressWarnings("serial")
public @Value class R02 implements Serializable {
  private String nome;
  private String cpf;
  @QueryProjection
  public R02(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }
}
