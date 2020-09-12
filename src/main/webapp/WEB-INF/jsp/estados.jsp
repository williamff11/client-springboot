<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Estados</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<div class="container-fluid" style="margin-top: 80px">
			<c:import url="/WEB-INF/jsp/header.jsp" />
		</div>

		<h3>Estados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Sigla</th>
					<th>Nome</th>
					<th>Região</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="estado" items="${listaEstados}">
					<tr>
						<td>${estado.id}</td>
						<td>${estado.sigla}</td>
						<td>${estado.nome}</td>
						<td>${estado.regiao.nome}</td>
						<td><a href="/estados/${estado.id}/municipios">Municipios</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>