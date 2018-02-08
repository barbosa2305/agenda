package br.com.javaweb.agenda.dao;

import static br.com.javaweb.agenda.entity.QItemContato.itemContato;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.hibernate.HibernateQuery;
import com.mysema.query.types.ConstructorExpression;

import br.com.javaweb.agenda.entity.ItemContato;
import br.com.javaweb.agenda.entity.TipoItemContato;
import br.com.javaweb.agenda.infra.dao.BaseDAO;
import br.com.javaweb.agenda.to.EmailContatoTO;

@Repository
public class ItemContatoDAO extends BaseDAO<ItemContato> {

	public List<EmailContatoTO> listarEmailsContatos() {
		HibernateQuery query = new HibernateQuery(getSession());

		// @formatter:off
		return query.from(itemContato)
				.where(itemContato.tipoItemContato().id.eq(TipoItemContato.EMAIL_ID))
				.list(ConstructorExpression.create(
						EmailContatoTO.class, 
						itemContato.contato().nome, 
						itemContato.valor));
		// @formatter:on
	}
}