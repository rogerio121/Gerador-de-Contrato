package br.com.geracontrato.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.geracontrato.model.Inquilino;

public class InquilinoDao {

	EntityManager manager;
	
	public InquilinoDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPersistence");
		this.manager = factory.createEntityManager();
	}
	
	public void inserir(Inquilino inquilino) {
		manager.getTransaction().begin();
		manager.persist(inquilino);
		manager.getTransaction().commit();
		
	}
}
