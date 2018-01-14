package inquilino;
import br.com.geracontrato.dao.InquilinoDao;
import br.com.geracontrato.model.Inquilino;

public class TestaEditarInquilino {

	public static void main(String[] args) {
		
		Inquilino inquilino = new Inquilino();
		
		inquilino.setCpf("123");
		inquilino.setNome("Rogerio");
		inquilino.setRg("111");
		inquilino.setEstadoCivil("casado");
		inquilino.setIdImovel(1);

		InquilinoDao dao = new InquilinoDao();

		dao.update(inquilino);

		System.out.println("Alterado com sucesso");
	}

}
