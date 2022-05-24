<%@page import="java.util.*"%>
<%@page import="Modelo.Ciudad"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<nav>
			<a href="#">Ciudades</a>
		</nav>
	</div>
	<h1> Lista De Ciudades </h1>
	<%!List<Ciudad> listaCiudades; %>
	<% 
try{
	listaCiudades=(List<Ciudad>) request.getAttribute("ciudades");
	Iterator<Ciudad> item=listaCiudades.iterator();
	%>
	<div>
		<table>
			<thead>
				<th>Id_Ciudad</th>
				<th>Nombre Ciudad</th>
				<th>Código Ciudad</th>
			</thead>
			<tbody>
				<% while(item.hasNext()){
				Ciudad ciudad=item.next(); %>
				<tr>
					<td><%= ciudad.getId_ciudad() %></td>
					<td><%= ciudad.getNombre_ciudad() %></td>
					<td><%= ciudad.getCodigo_ciudad() %></td>
				</tr>
			</tbody>
			<% } %>
		</table>
	</div>
	<%}catch(Exception e){
		

	}%>

</body>
</html>