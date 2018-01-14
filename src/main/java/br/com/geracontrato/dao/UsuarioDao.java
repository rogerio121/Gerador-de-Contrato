package br.com.geracontrato.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.geracontrato.model.Usuario;

public class UsuarioDao {

	EntityManager manager;

	public UsuarioDao(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPersistence");
		this.manager = factory.createEntityManager();
	}

	public void insert(Usuario usuario) {
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
	}
	
	
}
