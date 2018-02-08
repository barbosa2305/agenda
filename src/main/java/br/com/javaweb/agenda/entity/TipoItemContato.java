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
@Table(schema = "dbo", name = "TIPO_ITEM_CONTATO")
public class TipoItemContato {
	public static final Integer EMAIL_ID = 1;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoItemContato", nullable = false)
	private Integer id;

	@Column(name = "nmTipoItemContato", nullable = false, length = 50)
	private String nome;
	
	@Type(type=HibernateTypes.SimNaoType)
	@Column(name = "stAtivo", nullable = false, length = 1)
	private Boolean ativo;

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