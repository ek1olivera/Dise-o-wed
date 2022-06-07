<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Departamento</title>
</head>
<body>
	<h1>Crear Departamento</h1>
	<form action="DepartamentoServletController" method="post">
		<input type="hidden" name="opcion" value="guardar">
		<table>
			<tr>
				<td>Codigo Departamento</td>
				<td><input type="text" name="cod_depart" size="50"></td>
			</tr>
			<tr>
				<td>Departamento Nombre</td>
				<td><input type="text" name="name_depart" size="50"></td>
			</tr>
		</table>
		<input type="submit" value="Guardar">
	</form>
</body>
</html>