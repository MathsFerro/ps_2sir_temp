package br.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.Conexao;
import br.ps.entities.Usuario;

public class UsuarioDAO {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public boolean addUser( Usuario user ) {
		sql = "INSERT INTO tb_users (nm_user, password, is_admin) VALUES (?, ?, ?)";
		connection = new Conexao().conectar();
		try {
			ps = connection.prepareStatement(sql);
				
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.setInt(3, Integer.parseInt(user.getIsAdmin()));
			
			ps.execute();

			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Boolean checkExistUser( String name, String password ) {
		String sql = "SELECT * FROM tb_users WHERE nm_user = ? and password = ?";
		connection = new Conexao().conectar();
		try {
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, password);

			rs = ps.executeQuery();
			
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
