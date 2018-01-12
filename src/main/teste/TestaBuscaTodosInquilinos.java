import java.util.List;

import br.com.geracontrato.dao.InquilinoDao;
import br.com.geracontrato.model.Inquilino;

public class TestaBuscaTodosInquilinos {
	public static void main(String[] args) {
		
		InquilinoDao dao = new InquilinoDao();
		
		List<Inquilino> inquilinos = dao.buscarTodosIquilinos();
		
		for(Inquilino inquilino : inquilinos) {
			System.out.println("Nome:  "+inquilino.getNome());
		}
	}
	
}
