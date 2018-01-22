package Usuario;

import br.com.geracontrato.dao.UsuarioDao;

public class TestaExcluirUsuario {
	public static void main(String[] args) {
		UsuarioDao dao = new UsuarioDao();

		dao.delete("1233");
		
		System.out.println("Deletado com sucesso!");
	}

}
