package br.com.javaweb.agenda.dao;

import org.springframework.stereotype.Repository;

import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.infra.dao.BaseDAO;

@Repository
public class ContatoDAO extends BaseDAO<Contato> {

	public ContatoDAO() {
	}
}