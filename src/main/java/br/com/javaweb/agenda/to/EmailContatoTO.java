package br.com.javaweb.agenda.to;

public class EmailContatoTO {
	private String nomeContato;
	private String email;
	
	public EmailContatoTO() {
	}
	
	public EmailContatoTO(String nomeContato, String email) {
		this.nomeContato = nomeContato;
		this.email = email;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}