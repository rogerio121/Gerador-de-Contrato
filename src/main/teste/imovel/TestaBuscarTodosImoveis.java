package imovel;

import java.util.List;

import br.com.geracontrato.dao.ImovelDao;
import br.com.geracontrato.model.Imovel;

public class TestaBuscarTodosImoveis {
	public static void main(String[] args) {
		ImovelDao dao = new ImovelDao();

		List<Imovel> imoveis = dao.buscarTodosImoveis();

		for(Imovel imovel : imoveis) {

			System.out.println("Id imovel: "+imovel.getIdImovel());
		}
	}
}
