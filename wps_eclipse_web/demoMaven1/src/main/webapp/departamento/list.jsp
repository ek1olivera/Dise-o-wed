<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<a class="btn btn-success" href="#">Crear</a>
		<h2>Lista Departamentos</h2>
		<div>
			<table class="table">
				<thead class="table-dark">
					<th>Id_Depart</th>
					<th>Depart_Codigo</th>
					<th>Depart_Nombre</th>
					<th>Fecha_Hora_Crea</th>
					<th>Fecha_Hora_Modifica</th>
					<th>Acciones</th>
				</thead>
				<tbody>
					<c:forEach var="depar" items="${departamentos}">
						<tr>
							<td><c:out value="${depar.id_Depart}" /></td>
							<td><c:out value="${depar.depart_codigo}" /></td>
							<td><c:out value="${depar.depart_nombre}" /></td>
							<td><c:out value="${depar.fecha_hora_crea}" /></td>
							<td><c:out value="${depar.fecha_hora_modf}" /></td>
							
							
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>