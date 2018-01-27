<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<title>Cadastro de inquilino</title>
</head>
<body>

	<form action="salvar-inquilino">

		Nome completo: <input type="text" name="nome" id="inqNome"> <br>
		R.G: <input type="text" name="rg" id="inqRg"> <br>
		CPF: <input type="text" name="cpf" id="inqCpf"> <br>
		Estádo civíl: <input type="text" name="estadoCivil" id="inqEstadoCivil"> <br>
		Id imóvel: <input type="text" name="idImovel" id="inqIdImovel"> <br>
		<input type="submit" value="Salvar">
		<button>Cancelar</button>
	</form>
</body>
</html>
