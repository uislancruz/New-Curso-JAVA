package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//while indeterminado
		
		Scanner entrada = new Scanner(System.in);
		
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			
			valor = entrada.nextLine();
			
		}
		
		entrada.close();
		
	}

}
