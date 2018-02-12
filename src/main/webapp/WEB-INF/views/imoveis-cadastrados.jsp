<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imóveis Cadastrados</title>
</head>
<body>
	<body>


	<table border="1">
		<tr>
			<th>ID</th>
			<th>Valor</th>
			<th>Bairro</th>
			<th>Comodos</th>
		</tr>
		<c:forEach var="imovel" items="${imoveis}">
			<tr>
				<td>${imovel.idImovel}</td>
				<td>${imovel.valorEmNumero}</td>
				<td>${imovel.bairro}</td>
				<td>${imovel.comodos}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>