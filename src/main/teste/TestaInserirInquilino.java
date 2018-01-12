import br.com.geracontrato.dao.InquilinoDao;
import br.com.geracontrato.model.Inquilino;

public class TestaInserirInquilino {


public static void main(String[] args) {
	
	Inquilino inquilino = new Inquilino();
	
	inquilino.setCpf("123");
	inquilino.setNome("Inquilino1");
	inquilino.setRg("321");
	inquilino.setEstadoCivil("solteiro");
	inquilino.setIdImovel(1);

	InquilinoDao dao = new InquilinoDao();

	dao.insert(inquilino);
	
	System.out.println("Salvo com sucesso");
}
}
