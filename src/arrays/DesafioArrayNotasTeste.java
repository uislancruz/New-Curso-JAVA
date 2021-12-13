package arrays;

import java.util.Scanner;

public class DesafioArrayNotasTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas:");
		
		int quantidadeNotas= entrada.nextInt();
		
		double [] notas = new double [quantidadeNotas];
		System.out.println(quantidadeNotas);
		
		entrada.close();
		
	}

}
