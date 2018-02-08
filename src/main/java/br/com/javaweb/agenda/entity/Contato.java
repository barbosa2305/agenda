package br.com.javaweb.agenda.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "dbo", name = "CONTATO")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContato", nullable = false)
	private Integer id;

	@Column(name = "nmContato", nullable = false, length = 250)
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(schema = "dbo", name = "CONTATO_GRUPO", joinColumns = { @JoinColumn(name = "idContato", referencedColumnName = "idContato") }, inverseJoinColumns = {
			@JoinColumn(name = "idGrupo", referencedColumnName = "idGrupo") })
	private List<Grupo> grupos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}