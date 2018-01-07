package br.com.geracontrato.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {

	private static final String PERSISTENCE_UNIT_NAME = "conectaPercistence";
	
	private static EntityManagerFactory entityManagerFactory;
	
	
	// Método para instanciar um EntityManagerFactory
	public EntityManagerFactory instancicarEntityManagerFactory() {
		if(entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return entityManagerFactory;
	}
}
