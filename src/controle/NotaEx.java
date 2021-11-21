package controle;

import java.util.Scanner;

public class NotaEx {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		}else if(media >=4 && media < 7) {
			System.out.println("Recuperação");
		}else if(media < 4) {
			System.out.println("Reprovado");
		}else {
			System.out.println("As notas digitadas foram maiores que o permidito de 0 à 10. \n tente novamente");
		}
		
		
	}

}
