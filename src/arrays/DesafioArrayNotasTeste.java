package arrays;

import java.util.Scanner;

public class DesafioArrayNotasTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas:");
		
		int quantidadeNotas= entrada.nextInt();
		
		double [] notas = new double [quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota" + i + 1 + ": ");
			notas[i] = entrada.nextInt();
		}
		
		entrada.close();
		
	}

}
