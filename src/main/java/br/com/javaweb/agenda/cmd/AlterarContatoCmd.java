package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class AlterarContatoCmd {
	
	@Autowired
	private ContatoDAO contatoDAO;

	public ContatoTO alterar(ContatoTO contatoTO) {
		Contato contato = contatoDAO.getPorCodigo(contatoTO.getId());
		contato.setNome(contatoTO.getNome());
		contatoDAO.update(contato);
		return new ContatoTO(contato.getId(), contato.getNome());
	}
}