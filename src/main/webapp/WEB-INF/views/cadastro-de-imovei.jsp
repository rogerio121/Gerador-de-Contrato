<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Cadastro de usu�rio</title>
</head>
<body>

	<form>

		Rua: <input type="text" name="rua" id="imovRua"> <br>
		Bairro: <input type="text" name="bairro" id="imovBairro"> <br>
		Cidade: <input type="text" name="cidade" id="imovCidade"> <br>
		UF: <select id="uf">
		    <option value="">-- Selecione --</option>
		    <option value="AC">Acre</option>
		    <option value="AL">Alagoas</option>
		    <option value="AP">Amap�</option>
		    <option value="AM">Amazonas</option>
		    <option value="BA">Bahia</option>
		    <option value="CE">Cear�</option>
		    <option value="DF">Distrito Federal</option>
		    <option value="ES">Esp�rito Santo</option>
		    <option value="GO">Goi�s</option>
		    <option value="MA">Maranh�o</option>
		    <option value="MT">Mato Grosso</option>
		    <option value="MS">Mato Grosso do Sul</option>
		    <option value="MG">Minas Gerais</option>
		    <option value="PA">Par�</option>
		    <option value="PB">Para�ba</option>
		    <option value="PR">Paran�</option>
		    <option value="PE">Pernambuco</option>
		    <option value="PI">Piau�</option>
		    <option value="RJ">Rio de Janeiro</option>
		    <option value="RN">Rio Grande do Norte</option>
		    <option value="RS">Rio Grande do Sul</option>
		    <option value="RO">Rond�nia</option>
		    <option value="RR">Ror�ima</option>
		    <option value="SC">Santa Catarina</option>
		    <option value="SP">S�o Paulo</option>
		    <option value="SE">Sergipe</option>
		    <option value="TO">Tocantins</option>
		</select> <br>
		N�mero: <input type="text" name="numero" id="imovNumero"> <br>
		CEP: <input type="text" name="cep" id="imovCep"> <br>

		Valor do im�vel em reais: <input type="text" name="vlImovelReais" id="imovVlReais"> <br>
		Valor do im�vel por extenso: <input type="text" name="vlImovelExtenso" id="imovVlExtenso"> <br>

		Comodos <input type="number" name="qtComodos" id="imovQtComodos"> <br>

		<input type="submit" value="Salvar">
		<button>Cancelar</button>
	</form>
</body>
</html>
