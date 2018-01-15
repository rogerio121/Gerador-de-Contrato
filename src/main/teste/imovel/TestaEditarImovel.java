package Imovel;

import br.com.geracontrato.dao.ImovelDao;
import br.com.geracontrato.model.Imovel;

public class TestaEditarImovel {
	public static void main(String[] args) {
		Imovel imovel = new Imovel();

		imovel.setBairro("bairro Editado");
		imovel.setCep("cep Edit");
		imovel.setCidade("cidade Editado");
		imovel.setComodos(3);
		imovel.setCpfUsuario("1233");
		imovel.setNumero(21);
		imovel.setRua("rua Editado");
		imovel.setUf("SP");
		imovel.setValorExtenso("vl Editado");
		imovel.setValorEmNumero(33.2);
		imovel.setIdImovel(1);

		ImovelDao dao = new ImovelDao();

		dao.update(imovel);

		System.out.println("Editado com sucesso !");
	}
}
