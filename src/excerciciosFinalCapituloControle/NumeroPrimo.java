package excerciciosFinalCapituloControle;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se � primo:");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " � primo.");
		} else {
			System.out.println("\nO numero " + numero + " n�o � primo.");
		}

		entrada.close();

	}

}
