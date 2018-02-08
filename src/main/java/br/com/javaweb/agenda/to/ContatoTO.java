package br.com.javaweb.agenda.to;

import java.util.List;

public class ContatoTO {
	private Integer id;
	private String nome;
	private List<String> grupos;
	
	public ContatoTO() {
	}
	
	public ContatoTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public ContatoTO(Integer id, String nome, List<String> grupos) {
		super();
		this.id = id;
		this.nome = nome;
		this.grupos = grupos;
	}

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

	public List<String> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
}