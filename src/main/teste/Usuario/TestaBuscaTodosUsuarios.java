package Usuario;

import java.util.List;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;

public class TestaBuscaTodosUsuarios {

	public static void main(String[] args) {


		UsuarioDao dao = new UsuarioDao();

		List<Usuario> usuarios = dao.buscarTodosUsuarios();

		for(Usuario usuario : usuarios) {
			System.out.println("Nome: "+usuario.getNome());
		}
	}
}
