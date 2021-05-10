<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro Estado</h1>
	<form name="cadastroEstado" method="post" action="/projweb/GravaEstado">
	
	Nome: <input type="text"  name="nome" /> <br/>
	Sigla: <input type="text"  name="sigla" /> <br/>
	Codigo IBGE: <input type="text"  name="codigoIbge" /> <br/>
	
	<input type="submit" value="Submit"/>
	
	</form>
</body>
</html>