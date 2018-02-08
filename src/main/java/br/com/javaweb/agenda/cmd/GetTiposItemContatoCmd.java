package br.com.javaweb.agenda.cmd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.TipoItemContatoDAO;
import br.com.javaweb.agenda.entity.TipoItemContato;
import br.com.javaweb.agenda.to.TipoItemContatoTO;

@Component
public class GetTiposItemContatoCmd {
	
	@Autowired
	private TipoItemContatoDAO tipoItemContatoDAO;

	public List<TipoItemContatoTO> get() {
		List<TipoItemContato> tipos = tipoItemContatoDAO.listarAtivos();
		List<TipoItemContatoTO> tiposTO = new ArrayList<>();
		for (TipoItemContato tipoItemContato : tipos) {
			tiposTO.add(new TipoItemContatoTO(tipoItemContato.getId(), tipoItemContato.getNome()));
		}	
		return tiposTO;
	}
}