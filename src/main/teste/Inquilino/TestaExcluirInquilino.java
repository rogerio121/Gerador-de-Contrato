package Inquilino;
import br.com.geracontrato.dao.InquilinoDao;

public class TestaExcluirInquilino {
	public static void main(String[] args) {		
		InquilinoDao dao = new InquilinoDao();
		
		dao.delete("123");
		
		System.out.println("Excluido com sucesso!");
	}
}
