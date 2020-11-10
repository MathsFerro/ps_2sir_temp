<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registrar Usuário</h1>
	<hr>
	<form action="register" method="post">
		<label for="nm_user">Nome: </label><br>
		<input name="nm_user" type="text"></input><br><br>
	
		<label for="password">Senha: </label><br>
		<input name="password" type="password"></input><br><br>
		
		<label for="password_confirm">Confirmar senha: </label><br>
		<input name="password_confirm" type="password"></input><br><br>
		
	
		<input name="is_admin" type="checkbox"></input>
			<label for="is_admin">Administrador</label><br><br>
		<hr>
		
		<a href="http://localhost:8080/PS_2SIR/index.jsp">
   			<button type="button">Voltar</button>
		</a>
		<input name="button" value="register" type="submit"></input>

	</form>
</body>
</html>