package br.com.geracontrato.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.geracontrato.model.Inquilino;

public class InquilinoDao {

	EntityManager manager;
	
	public InquilinoDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPersistence");
		this.manager = factory.createEntityManager();
	}
	
	
	
	public void insert(Inquilino inquilino) {
		manager.getTransaction().begin();
		manager.persist(inquilino);
		manager.getTransaction().commit();
		
	}
	
	
	
	public void update(Inquilino inquilino) {
		
		if(inquilino.getCpf() != null) {
			manager.getTransaction().begin();
			manager.merge(inquilino);
			manager.getTransaction().commit();
		}
	}
	
	
	
	public void delete(String cpf) {
		Inquilino inquilino = buscaPorId(cpf);
		
		manager.getTransaction().begin();
		manager.remove(inquilino);
		manager.getTransaction().commit();
	}
	
	
	
	public Inquilino buscaPorId(String cpf) {
		Inquilino inquilino = manager.find(Inquilino.class, cpf);
		
		return inquilino;
	}
	
	
	
	public List<Inquilino> buscarTodosIquilinos(){
		
		Query query = manager.createQuery("SELECT i FROM Inquilino as i");
		
		List<Inquilino> inquilinos = query.getResultList();
		
		return inquilinos;
	}
	
	
}
