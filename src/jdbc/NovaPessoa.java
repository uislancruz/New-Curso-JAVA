package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.next();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (" + nome + ")";
		
		entrada.close();
	}

}
