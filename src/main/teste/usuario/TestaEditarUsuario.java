package Usuario;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;

public class TestaEditarUsuario {
	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		usuario.setNome("ArgemiroEditado");
		usuario.setCpf("1233");

		UsuarioDao dao = new UsuarioDao();

		dao.update(usuario);

		System.out.println("Editado com sucesso!");
	}
}
