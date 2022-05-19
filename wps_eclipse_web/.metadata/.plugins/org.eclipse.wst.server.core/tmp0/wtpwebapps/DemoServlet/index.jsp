<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="modelo.Persona"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="ServletPersonaControler" method="get">
			<div>
				<label>Nombre</label> <input type="text" name="nombre">
			</div>
			<div>
				<label>Apellido</label> <input type="text" name="apellido">
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
	</div>
	<%!List<Persona> listaPersona;%>
	<%
	try{
	listaPersona = (List<Persona>) request.getAttribute("lista");
	Iterator<Persona> item = listaPersona.iterator();
	%>
	<table class="table">
		<thead class="table-info">
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Acciones</th>
		</thead>
		<tbody>
		<%
		while(item.hasNext()){
			Persona persona=item.next();
		%>
			<tr>
				<td><%= persona.getNombre() %></td>
				<td><%= persona.getApellido() %></td>
				<td><a href=#>Editar</a></td>
			</tr>
			<% }
	}catch(Exception e){}
		%>
		</tbody>
	</table>


</body>
</html>