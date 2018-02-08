package br.com.javaweb.agenda.cmd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ItemContatoDAO;
import br.com.javaweb.agenda.to.EmailContatoTO;

@Component
public class GetEmailsContatosCmd {
	
	@Autowired
	private ItemContatoDAO itemContatoDAO;
	
	public List<EmailContatoTO> get() {
		return itemContatoDAO.listarEmailsContatos();
	}
}