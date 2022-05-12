package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestesConecxao {
	
	public static void main(String[] args) throws SQLException{
		
		final String url = "jdbc:mysql://localhost:3306";
		final String usuario = "root";
		final String senha = "tricolor";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
	}

}
