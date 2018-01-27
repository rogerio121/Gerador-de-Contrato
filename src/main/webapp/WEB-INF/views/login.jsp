<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>

<head>
<title>Cadastro de usuário</title>
</head>

<body id="corpoLogin">

	<div id="caixaDeLogin">
		<form action="telainicial" method="post">
			<table id="tabelaLogin">
				<tr>
					<td>Login:</td>
					<td><input type="text" name="login"></td>
				</tr>

				<tr>
					<td>Senha:</td>
					<td><input type="password" name="senha"></td>
				</tr>

				<tr>
					<td colspan="2"><button type="submit" id="submitLogin">Logar</button></td>
					
				</tr>
			</table>
			
			<dir id="divRefLoogin">
				<a href="">Esqueci minha senha</a>  <a href="cadastro">Cadastrar usuário</a>
			</dir>
			
		</form>
	</div>
</body>
</html>
