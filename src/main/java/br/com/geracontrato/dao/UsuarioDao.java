package br.com.geracontrato.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.geracontrato.model.Usuario;

public class UsuarioDao {

	EntityManager manager;
	
	public UsuarioDao() {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("conectaPersistence");
		
		manager = factory.createEntityManager();
	}
	
	public void insert(Usuario usuario) {
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
	}
	
	public void update(Usuario usuario) {
		if(usuario.getCpf() != null) {
			manager.getTransaction().begin();
			manager.merge(usuario);
			manager.getTransaction().commit();
		}
	}
	
	public void delete(String cpf) {
		
		Usuario usuario = buscaPorCpf(cpf);
		
		manager.getTransaction().begin();
		manager.remove(usuario);
		manager.getTransaction().commit();
	}
	
	public Usuario buscaPorCpf(String cpf) {
		Usuario usuario = manager.find(Usuario.class,cpf);
		
		return usuario;
	}
	
	public List<Usuario> buscarTodosUsuarios(){
		Query query = manager.createQuery("SELECT u FROM Usuario as u");
		
		List<Usuario> usuarios = query.getResultList();
		
		return usuarios;
	}
	
	public Usuario buscarUsuarioPorSenhaEemail(String emailP, String senhaP){
		Query query = manager.createQuery("SELECT u FROM Usuario as u WHERE u.email = :email AND u.senha = :senha");
		query.setParameter("email", emailP);
		query.setParameter("senha", senhaP);
	    Usuario usuarioReturn = (Usuario) query.getSingleResult();
		
		return usuarioReturn;
	}
	
	
}
