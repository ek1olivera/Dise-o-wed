<%@page import="java.util.*"%>
<%@page import="Modelo.Ciudad"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Ciudades</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<nav>
			<a href="#">Ciudades</a>
		</nav>
	</div>
	<h1>Lista De Ciudades</h1>
	<%!List<Ciudad> listaCiudades;%>
	<%
	try {
		listaCiudades = (List<Ciudad>) request.getAttribute("ciudades");
		Iterator<Ciudad> item = listaCiudades.iterator();
	%>
	<div>
		<table class="table">
			<thead class="table-info">
				<th>Id_Ciudad</th>
				<th>Nombre Ciudad</th>
				<th>Código Ciudad</th>
				<th>Acciones</th>
			</thead>
			<tbody>
				<%
				while (item.hasNext()) {
					Ciudad ciudad = item.next();
				%>
				<tr>
					<td><%=ciudad.getId_ciudad()%></td>
					<td><%=ciudad.getNombre_ciudad()%></td>
					<td><%=ciudad.getCodigo_ciudad()%></td>
					<td>
					     <a>Add</a> 
					     <a>Editar</a>
					</td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
	</div>
	<%
	} catch (Exception e) {

	}
	%>

</body>
</html>