package excerciciosFinalCapituloControle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		
		int ano = entrada.nextInt();
		int bissexto = ano %4;
		
		if (bissexto == 0) {
			System.out.println(ano + " � um ano bissexto");
		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}
		entrada.close();
	}

}


