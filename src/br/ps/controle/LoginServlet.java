package br.ps.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ps.controllers.UsuarioController;
import br.ps.dao.UsuarioDAO;
import br.ps.entities.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String route = "";
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioController user = new UsuarioController();
		RequestDispatcher dispatcher;
		
		String name = request.getParameter("nm_user");
		String password = request.getParameter("password");
		String button = request.getParameter("button");

		
		if(button.equalsIgnoreCase("logar")) 
			route = user.checkExistUser(name, password) ? "login.jsp" : "errorlogin.jsp";	
		else 
			route = "register.jsp";	
		
		dispatcher = request.getRequestDispatcher(route);
		dispatcher.forward(request, response);
	}

}
