package bd.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(of = "codigo")
@SuppressWarnings("serial")
@Entity
public @Data class Curso implements Serializable {
	@Id
	private String codigo;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false)
	private Integer creditos;
	
	@ManyToMany
	@JoinTable(name = "Materias_Obrigatorias", joinColumns = @JoinColumn(name = "codigo_curso"), inverseJoinColumns = @JoinColumn(name = "codigo_materia"))
	private List<Materia> obrigatorias;
	
	@ManyToMany
	@JoinTable(name = "Materias_Optativas", joinColumns = @JoinColumn(name = "codigo_curso"), inverseJoinColumns = @JoinColumn(name = "codigo_materia"))
	private List<Materia> optativas;
	
}
