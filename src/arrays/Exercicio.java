package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));// apenas para ver o valor do array sem atribuir valor
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		//codigo aprova de alterações, pq voce não ta usando numero fixo e sim quantidade de
		//array (no caso) como referencia
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total/notasAlunoA.length);
		
		double [] notasAlunoB = {6.9, 8.9, 5.5, 10};
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.println(total / notasAlunoB.length);
	}

}
