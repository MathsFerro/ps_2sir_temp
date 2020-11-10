<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<hr>
	<form action="login" method="post">
		<label for="nm_user">Nome: </label><br>
		<input name="nm_user" type="text"></input><br><br>
	
		<label for="password">Senha: </label><br>
		<input name="password" type="password"></input><br><br>
		<hr>
		
		<input name="button" value="Logar" type="submit"></input>
		
		<a href="http://localhost:8080/PS_2SIR/register.jsp">
			<input name="button" value="Não tenho cadastro" type="button"></input>
		</a>
	</form>
</body>
</html>