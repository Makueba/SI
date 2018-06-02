package bd.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@SuppressWarnings("serial")
@Entity
public @Data class Curso implements Serializable {
	@Id
	private String codigo;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@ManyToMany
	@Column(nullable = false)
	private List<Materia> obrigatorias;
	
	@ManyToMany
	@Column(nullable = false)
	private List<Materia> optativas;
	
}
