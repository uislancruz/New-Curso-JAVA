package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça(V ou F)
		//trabalho na quinda(V ou F)
		
			
		Scanner teclado = new Scanner(System.in);
			
		
		System.out.println("Informe o numero de empregos que voce passou?: ");
		int valor1 = teclado.nextInt();
		
		if (valor1 == 1) {
			System.out.println("Iremos ao shopping comprar a TV de 32 e tomar sorvete");			
		}
			if(valor1 == 2) {
				System.out.println("Iremos ao shopping comprar a TV de 50 polegadas e tomar sorvete");
			}else if(valor1 == 0) {
				System.out.println("Infelizmente ficaremos em casa :'( ");
			}else {
				System.out.println("NUMERO INVALIDO");
			}
	}
		
		
		
	}


