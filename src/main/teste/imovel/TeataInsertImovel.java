package imovel;

import br.com.geracontrato.dao.ImovelDao;
import br.com.geracontrato.model.Imovel;

public class TeataInsertImovel {
	public static void main(String[] args) {
		
		Imovel imovel = new Imovel();
		
		imovel.setBairro("bairro teste");
		imovel.setCep("cep teste");
		imovel.setCidade("cidade teste");
		imovel.setComodos(3);
		imovel.setCpfUsuario("1233");
		imovel.setNumero(21);
		imovel.setRua("rua Teste");
		imovel.setUf("SP");
		imovel.setValorExtenso("vl Teste");
		imovel.setValorEmNumero(33.2);
		
		ImovelDao dao = new ImovelDao();
		
		dao.insert(imovel);
		
		System.out.println("Salvo com sucesso !");
	}
}
