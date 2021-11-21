package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
			conceito = "A";
			break;
			
		}
		
		System.out.println("Conceito é: "+ conceito);
		entrada.close();
	}

}
