<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
	<title>Cadastro de usuário</title>
</head>
<body>

	<form>

		Nome completo: <input type="text" name="nome" id="usuNome"> <br>
		R.G: <input type="text" name="rg" id="usuRg"> <br>
		CPF: <input type="text" name="cpf" id="usuCpf"> <br>
		Estádo civíl: <input type="text" name="estadoCivil" id="usuEstadoCivil"> <br>

		<input type="submit" value="Salvar">
		<button>Cancelar</button>
	</form>
</body>
</html>
