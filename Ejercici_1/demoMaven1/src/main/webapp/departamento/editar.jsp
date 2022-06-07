<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Departamento</title>
</head>
<body>
	<h1>Editar Producto</h1>
	<form action="DepartamentoServletController" method="post">
	<c:set var="departamento" value="${departamento}"></c:set>
		<input type="hidden" name="opcion" value="editar">
		<input type="hidden" name="id" value="${departamento.id_Depart }i">
		<table>
			<tr>
				<td>Codigo Departamento</td>
				<td><input type="text" name="cod_depart" size="50" value="${departamento.cod_depart }"></td>
			</tr>
			<tr>
				<td>Departamento Nombre</td>
				<td><input type="text" name="name_depart" size="50" value="${departamento.name_depart }"></td>
			</tr>
		</table>
		<input type="submit" value="Guardar">
	</form>


</body>
</html>