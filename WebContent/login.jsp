<%@page import="br.ps.entities.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String nome = (String) request.getAttribute("nm_user");
	%>
	<h1>Tela login</h1>
	<h4><%= nome %></h4><br><hr>
</body>
</html>