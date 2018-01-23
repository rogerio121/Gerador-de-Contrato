<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Cadastro de usuário</title>
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
		    <option value="AP">Amapá</option>
		    <option value="AM">Amazonas</option>
		    <option value="BA">Bahia</option>
		    <option value="CE">Ceará</option>
		    <option value="DF">Distrito Federal</option>
		    <option value="ES">Espírito Santo</option>
		    <option value="GO">Goiás</option>
		    <option value="MA">Maranhão</option>
		    <option value="MT">Mato Grosso</option>
		    <option value="MS">Mato Grosso do Sul</option>
		    <option value="MG">Minas Gerais</option>
		    <option value="PA">Pará</option>
		    <option value="PB">Paraíba</option>
		    <option value="PR">Paraná</option>
		    <option value="PE">Pernambuco</option>
		    <option value="PI">Piauí</option>
		    <option value="RJ">Rio de Janeiro</option>
		    <option value="RN">Rio Grande do Norte</option>
		    <option value="RS">Rio Grande do Sul</option>
		    <option value="RO">Rondônia</option>
		    <option value="RR">Rorâima</option>
		    <option value="SC">Santa Catarina</option>
		    <option value="SP">São Paulo</option>
		    <option value="SE">Sergipe</option>
		    <option value="TO">Tocantins</option>
		</select> <br>
		Número: <input type="text" name="numero" id="imovNumero"> <br>
		CEP: <input type="text" name="cep" id="imovCep"> <br>

		Valor do imóvel em reais: <input type="text" name="vlImovelReais" id="imovVlReais"> <br>
		Valor do imóvel por extenso: <input type="text" name="vlImovelExtenso" id="imovVlExtenso"> <br>

		Comodos <input type="number" name="qtComodos" id="imovQtComodos"> <br>

		<input type="submit" value="Salvar">
		<button>Cancelar</button>
	</form>
</body>
</html>
