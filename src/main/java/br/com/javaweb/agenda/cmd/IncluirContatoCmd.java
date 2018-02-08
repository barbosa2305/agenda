package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class IncluirContatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public ContatoTO incluir(ContatoTO contatoTO) {
		Contato contato = new Contato();
		contato.setNome(contatoTO.getNome());
		contatoDAO.insert(contato);
		return new ContatoTO(contato.getId(), contato.getNome());
	}
}