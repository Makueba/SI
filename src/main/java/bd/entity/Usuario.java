package bd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
	private Curso curso;
	
	private String semestre;
	
	@ManyToMany
	@JoinTable(name = "Usuario_Cursada", joinColumns = @JoinColumn(name = "id_Usuario"), inverseJoinColumns = @JoinColumn(name = "id_Materia"))
	private List<Materia> materias; 
}
