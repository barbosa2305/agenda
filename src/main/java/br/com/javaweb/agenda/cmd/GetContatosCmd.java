package br.com.javaweb.agenda.cmd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class GetContatosCmd {

	@Autowired
	private ContatoDAO contatoDAO;

	public List<ContatoTO> get() {
		List<ContatoTO> contatosTO = new ArrayList<ContatoTO>();
		List<Contato> contatos = contatoDAO.listAll();
		for (Contato contato : contatos) {
			contatosTO.add(new ContatoTO(contato.getId(), contato.getNome()));
		}
		return contatosTO;
	}
}