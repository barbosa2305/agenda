package br.com.javaweb.agenda.cmd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.entity.Grupo;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class GetContatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	public ContatoTO get(Integer idContato) {
		Contato contato = contatoDAO.getPorCodigo(idContato);
		List<Grupo> grupos = contato.getGrupos();
		List<String> gruposString = new ArrayList<String>();
		for (Grupo grupo : grupos) {
			if (grupo.getAtivo()) {
				gruposString.add(grupo.getNome());
			}
		}
		
		return new ContatoTO(contato.getId(), contato.getNome(), gruposString);
	}
}