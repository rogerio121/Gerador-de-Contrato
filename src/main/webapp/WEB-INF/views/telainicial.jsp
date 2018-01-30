<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>

<head>
<title>Início</title>
</head>
<body>
	<h3>Bem vindo ${usuario.nome} ${usuario.cpf}</h3>
	<br />
	<br />
	<br />
	<br />
	<br />

	<nav id = "menuInicio">
		<div>
			Consultar <br /> <a>Inquilinos</a><br /> <a>Imoveis</a>
		</div>
	
		<div>
			Cadastro <br /> <a href="cadastro-inquilino">Inquilinos</a><br /> <a
				href="cadastro-imovel?cpf=${usuario.cpf}">Imoveis</a>
		</div>
	</nav>
</body>
</html>