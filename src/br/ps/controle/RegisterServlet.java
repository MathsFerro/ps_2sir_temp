package br.ps.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ps.controllers.UsuarioController;
import br.ps.entities.Usuario;

@WebServlet("/register-user")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String route = "";
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioController user = new UsuarioController();
		
		String name = request.getParameter("nm_user");
		String password = request.getParameter("password");
		String password_confirm = request.getParameter("password_confirm");
		String is_admin = request.getParameter("is_admin");
		String button = request.getParameter("button");
		
		RequestDispatcher dispatcher;
		
		if(name != "" && password.equalsIgnoreCase(password_confirm)) 
			user.addUser(new Usuario(name, password_confirm, is_admin));
		
		dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}

}
