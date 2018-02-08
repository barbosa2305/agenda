package br.com.javaweb.agenda.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.agenda.cmd.GetTiposItemContatoCmd;
import br.com.javaweb.agenda.to.TipoItemContatoTO;

@Path("/tipoitemcontato")
@Component
public class TipoItemContatoService {
	
	@Autowired
	private GetTiposItemContatoCmd getTiposItemContatoCmd;
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<TipoItemContatoTO> getItensTipoContato() {
		
		
		return getTiposItemContatoCmd.get();
	}
}