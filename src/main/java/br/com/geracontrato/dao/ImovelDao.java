package br.com.geracontrato.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.geracontrato.model.Imovel;

public class ImovelDao {

	EntityManager manager;
	
	public ImovelDao() {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPersistence");
		manager = factory.createEntityManager();
	}
	
	public void insert(Imovel imovel) {
		manager.getTransaction().begin();
		manager.persist(imovel);
		manager.getTransaction().commit();
	}
	
	
	public void update(Imovel imovel) {
		
		if (imovel.getIdImovel() != 0) {
			manager.getTransaction().begin();
			manager.merge(imovel);
			manager.getTransaction().commit();
		}
	} 
	
	public void delet(int id) {
		 Imovel imovel = bucarPorId(id);
		 
		 manager.getTransaction().begin();
		 manager.remove(imovel);
		 manager.getTransaction().commit();
	}
	
	
	
	
	public Imovel bucarPorId(int id) {
		
		Imovel imovel = manager.find(Imovel.class, id);
		
		return imovel;
	}
	
	
	public List<Imovel> buscarTodosImoveis(){
		Query query = manager.createQuery("SELECT i FROM Imovel as i");
		
		List<Imovel> imoveis = query.getResultList();
		
		return imoveis;
	}
}
