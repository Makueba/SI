package bd.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Entity
@EqualsAndHashCode(of = "id")
@SuppressWarnings("serial")
public @Data class Materia implements Serializable {
	@Id
	@Column(nullable = false)
	private String codigo;
	
	@Column(nullable = false)
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "Materia_requisito", joinColumns = @JoinColumn(name = "id_Materia"), inverseJoinColumns = @JoinColumn(name = "id_Requisito"))
	private List<Materia> preRequisitos;
	
}
