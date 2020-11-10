package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String caminho = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		private String login = "RM83125";
		private String senha = "120499";
		
		private Connection connection;
		
		public Connection conectar() {
			try {
				Class.forName(driver);
				
				connection = DriverManager.getConnection(caminho, login, senha);
				
			} catch (ClassNotFoundException e) {
				System.out.println("Erro ao carregar o driver de conex�o \n" + e);
			} catch (SQLException e) {
				System.out.println("Erro ao conectar com o banco de dados \n" + e);
			}
			
			return connection;
		}
}
