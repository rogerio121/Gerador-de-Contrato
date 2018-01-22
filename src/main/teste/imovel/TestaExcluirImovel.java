package imovel;

import br.com.geracontrato.dao.ImovelDao;

public class TestaExcluirImovel {
	public static void main(String[] args) {
		ImovelDao dao = new ImovelDao();

		dao.delet(1);
		
		System.out.println("Removido com sucesso!");
	}
}
