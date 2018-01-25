package Usuario;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;

public class TestaBuscaUsuarioPorEmailEsenha {
	public static void main(String[] args) {

		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario();
		
		usuario = dao.buscarUsuarioPorSenhaEemail("rogerio@email", "123");
		
		System.out.println("Nome: " + usuario.getNome());
	}
}
