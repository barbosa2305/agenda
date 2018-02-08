package br.com.javaweb.agenda.dao;

import static br.com.javaweb.agenda.entity.QTipoItemContato.tipoItemContato;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.hibernate.HibernateQuery;

import br.com.javaweb.agenda.entity.TipoItemContato;
import br.com.javaweb.agenda.infra.dao.BaseDAO;

@Repository
public class TipoItemContatoDAO extends BaseDAO<TipoItemContato> {

	public TipoItemContatoDAO() {
	}

	public List<TipoItemContato> listarAtivos() {
		HibernateQuery query = new HibernateQuery(getSession());

		// @formatter:off
		return query.from(tipoItemContato)
				.where(tipoItemContato.ativo.isTrue())
				.list(tipoItemContato);
		// @formatter:on
	}
}