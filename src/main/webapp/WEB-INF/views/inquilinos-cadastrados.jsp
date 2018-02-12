<%@page import="br.com.geracontrato.model.Inquilino"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inquilinos Cadastrados</title>
</head>

<body>
	<h1>Inquilinos cadastrados</h1>
	<br />
	<br />

	<table border="1">
		<tr>
			<th>Nome</th>
			<th>RG</th>
			<th>CPF</th>
			<th>Imóvel</th>
		</tr>
		<c:forEach var="inquilino" items="${inquilinos}">
			<tr>
				<td>${inquilino.nome}</td>
				<td>${inquilino.rg}</td>
				<td>${inquilino.cpf}</td>
				<td>${inquilino.idImovel}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>