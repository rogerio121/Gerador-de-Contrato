<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/geral.css" />
<link rel="stylesheet" type="text/css" href="resources/css/cadastro-de-usuario.css" />
<title>Cadastro de usuário</title>
</head>


<body>
	<div id="caixaCadastroUsuario">
		<form action="salvar-usuario" method="post">
			<table id="tabCadastroDeUsuario">
				<tr>
					<td>Nome completo:</td>
					<td><input type="text" name="nome" id="usuNome"></td>
				</tr>
				<tr>
					<td>R.G:</td>
					<td><input type="text" name="rg" id="usuRg"></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><input type="text" name="cpf" id="usuCpf"></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><input type="text" name="email" id="usuEmail"></td>
				</tr>
				<tr>
					<td>Estádo civíl:</td>
					<td><input type="text" name="estadoCivil" id="usuEstadoCivil"></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="senha" id="usuSenha"></td>
				</tr>
				<tr>
					<!-- 		Confirme a Senha: <input type="password" name="confirmaSenha" id="usuConfirmasenha"> <br> -->
				</tr>
				<tr>
					<td><button type="submit">Salvar</button></td>
					<td><button>Cancelar</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

