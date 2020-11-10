package br.ps.entities;

public class Usuario {

	private String name;
	private String password;
	private String isAdmin;
	
	public Usuario( String name, String password, String isAdmin ) {
		this.password = password;
		this.isAdmin = isAdmin;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIs_admin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
}
