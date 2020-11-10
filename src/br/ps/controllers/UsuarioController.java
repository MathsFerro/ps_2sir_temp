package br.ps.controllers;

import br.ps.dao.UsuarioDAO;
import br.ps.entities.Usuario;

public class UsuarioController {

	UsuarioDAO dao = new UsuarioDAO();
	
	public Boolean addUser( Usuario user ) {
		return dao.addUser(user);
	}
 	
	public Boolean checkExistUser( String name, String password ) {
		if(name == null || password == null)
			return false;
		
		return dao.checkExistUser(name, password);
	}
	
}
