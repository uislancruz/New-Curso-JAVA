package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestesConecxao { 
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
		
	}
	
}

