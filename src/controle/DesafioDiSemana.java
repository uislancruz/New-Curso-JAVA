package controle;

import java.util.Scanner;

public class DesafioDiSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Dia: ");
		
		//int dia = entrada.nextInt();
		String dia = entrada.next();
			
		if(dia.equalsIgnoreCase("Domingo")) {
						
			System.out.println(1);
			
		}else if(dia.equalsIgnoreCase("Segunda")) {
			
			System.out.println(2);
			
		}else if(dia.equalsIgnoreCase("Ter�a")) {
			
			System.out.println(3);
		}else if(dia.equalsIgnoreCase("Quarta")) {
			
			System.out.println(4);
		}else if(dia.equalsIgnoreCase("Quinta")) {
			
			System.out.println(5);
		}else if(dia.equalsIgnoreCase("Sexta")) {
			
			System.out.println(6);
		}else if(dia.equalsIgnoreCase("Sabado")) {
			
			System.out.println(7);
		}
		
		
		
		
		entrada.close();
		
	}
	

}
