package Usuario;

import br.com.geracontrato.dao.UsuarioDao;
import br.com.geracontrato.model.Usuario;

public class TestaInserirUsuario {
	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		usuario.setNome("Argemiro");
		usuario.setEmail("email@email");
		usuario.setCpf("1233");
		usuario.setEstadoCivil("casado");
		usuario.setSenha("senha");
		usuario.setRg("33223");
		
		UsuarioDao dao = new UsuarioDao();
		
		dao.insert(usuario);
		
		System.out.println("Salvo com sucesso!");
	}
}
