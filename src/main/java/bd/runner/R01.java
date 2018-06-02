package bd.runner;
import java.io.Serializable;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Value;
@SuppressWarnings("serial")
public @Value class R01 implements Serializable {
  private String nomePartido;
  private Integer numeroPartido;
  private String candidato;
  @QueryProjection
  public R01(String nomePartido, Integer numeroPartido, String candidato) {
    this.nomePartido = nomePartido;
    this.numeroPartido = numeroPartido;
    this.candidato = candidato;
  }
}
