package br.com.javaweb.agenda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "dbo", name = "ITEM_CONTATO")
public class ItemContato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idItemContato", nullable = false)
	private Integer id;

	@Column(name = "dsValorContato", nullable = false, length = 100)
	private String valor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idContato", nullable = false)
	private Contato contato;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoItemContato", nullable = false)
	private TipoItemContato tipoItemContato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valorContato) {
		this.valor = valorContato;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public TipoItemContato getTipoItemContato() {
		return tipoItemContato;
	}

	public void setTipoItemContato(TipoItemContato tipoItemContato) {
		this.tipoItemContato = tipoItemContato;
	}
}