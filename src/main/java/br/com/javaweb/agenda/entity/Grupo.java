package br.com.javaweb.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import br.com.javaweb.agenda.infra.hibernate.HibernateTypes;

@Entity
@Table(schema = "dbo", name = "GRUPO")
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGrupo", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "nmGrupo", nullable = false, length = 100)
	private String nome;
	
	@Type(type = HibernateTypes.SimNaoType)
	@Column(name = "stAtivo", nullable = false, length = 1)
	private Boolean ativo;
	
	@Column(name = "stAtivo", insertable = false, updatable = false, nullable = false, length = 1)
	private String ativostr;
	
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
	
	public Boolean getAtivo() {
		return ativo;
	}
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}