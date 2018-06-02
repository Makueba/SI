package bd.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@SuppressWarnings("serial")
@Entity
public @Data class Usuario implements Serializable {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_sequence")
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	private String login;
	
	private String senha;
	
	@ManyToOne
	@JoinColumn(name="Curso", nullable=false)
	private Curso curso;
	
	private String semestre;
	
	@ManyToMany
	@JoinTable(name = "Usuario_Cursada", joinColumns = @JoinColumn(name = "id_Usuario"), inverseJoinColumns = @JoinColumn(name = "id_Materia"))
	private List<Materia> materias; 
}
