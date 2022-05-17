package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class FabricaConexao {
	
	public static Connection getConexao() {
		
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSl=true";
			final String usuario = "root" ;
			final String senha = "tricolor";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		

	}
	
	private static Properties getProperties() throws SQLException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		
		return prop;
	}
}
