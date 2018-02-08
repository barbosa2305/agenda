package br.com.javaweb.agenda.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.agenda.cmd.AlterarContatoCmd;
import br.com.javaweb.agenda.cmd.ExcluirContatatoCmd;
import br.com.javaweb.agenda.cmd.GetContatoCmd;
import br.com.javaweb.agenda.cmd.GetContatosCmd;
import br.com.javaweb.agenda.cmd.GetEmailsContatosCmd;
import br.com.javaweb.agenda.cmd.IncluirContatoCmd;
import br.com.javaweb.agenda.to.ContatoTO;
import br.com.javaweb.agenda.to.EmailContatoTO;

@Component
@Path("/contato")
public class ContatoService {
	
	@Autowired
	private GetContatosCmd getContatosCmd;
	
	@Autowired
	private GetContatoCmd getContatoCmd;
	
	@Autowired
	private GetEmailsContatosCmd getEmailsContatosCmd;
	
	@Autowired
	private IncluirContatoCmd incluirContatoCmd;
	
	@Autowired
	private ExcluirContatatoCmd excluirContatatoCmd; 
	
	@Autowired 
	private AlterarContatoCmd alterarContatoCmd;

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<ContatoTO> getContatos() {
		return getContatosCmd.get();
	}
	
	@GET
	@Path("/{idContato}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO getContato(@PathParam("idContato") Integer idContato) {
		return getContatoCmd.get(idContato);
	}
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO incluirContato(ContatoTO contato) {
		return incluirContatoCmd.incluir(contato);
	}
	
	@PUT
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO alterarContato(ContatoTO contato) {
		return alterarContatoCmd.alterar(contato);
	}
	
	@DELETE
	@Path("/{idContato}")
	@Transactional
	public void excluirContato(@PathParam("idContato") Integer idContato) {
		excluirContatatoCmd.excluir(idContato);
	}
	
	@GET
	@Path("/email")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<EmailContatoTO> getEmailsContatos() {
		return getEmailsContatosCmd.get();
	}
}