package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;

@Component
public class ExcluirContatatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public void excluir(Integer idContato) {
		Contato contato = contatoDAO.getPorCodigo(idContato);
		contatoDAO.delete(contato);
	}
}