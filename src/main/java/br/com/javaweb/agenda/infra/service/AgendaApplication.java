package br.com.javaweb.agenda.infra.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.javaweb.agenda.service.ContatoService;

public class AgendaApplication extends Application {
	
	private Set<Object> services = new HashSet<Object>();
	
	public AgendaApplication() {
		services.add(new ContatoService());
	}
	
	@Override
	public Set<Object> getSingletons() {
		return services;
	}
}