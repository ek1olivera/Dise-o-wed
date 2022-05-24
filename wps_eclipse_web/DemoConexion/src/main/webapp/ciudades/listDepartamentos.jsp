<%@page import="java.util.*"%>
<%@page import="Modelo.Departamentos"%>
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
			<a href="#">Departamentos</a>
		</nav>
	</div>
	<h1> Lista De Departamentos </h1>
	<%!List<Departamentos> listaDepartamentos; %>
	<% 
try{
	listaDepartamentos=(List<Departamentos>) request.getAttribute("departamentos");
	Iterator<Departamentos> item=listaDepartamentos.iterator();
	%>
	<div>
		<table>
			<thead>
				<th>Id_Departamento</th>
				<th>Departamento_Código</th>
				<th>Departamento_Nombre</th>
				<th>Fecha_Hora_Crea</th>
				<th>Fecha_Hora_Modf</th>
			</thead>
			<tbody>
				<% while(item.hasNext()){
				Departamentos departamento=item.next(); %>
				<tr>
					<td><%= departamento.getId_Depart() %></td>
					<td><%= departamento.getDepart_codigo() %></td>
					<td><%= departamento.getDepart_nombre() %></td>
					<td><%= departamento.getFecha_hora_crea() %></td>
					<td><%= departamento.getFecha_hora_modf() %></td>
				</tr>
			</tbody>
			<% } %>
		</table>
	</div>
	<%}catch(Exception e){
		

	}%>


</body>
</html>