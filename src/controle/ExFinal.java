package controle;

import java.util.Scanner;

public class ExFinal {
	public static void main(String[] args) {
		
		System.out.println("Insira um numero de 0 at� 10: ");
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		
		if (valor >= 0 && valor <= 10) {
			if (valor%2 == 0) {
				System.out.println("Valor �: " +valor+" e � um numero Par");
			}else {
				System.out.println("Valor �: " +valor+" e � um numero impar");
			}
		}
		
		
	
		entrada.close();
	}

}



/*if (valor >= 0 && valor <= 10) {
	if(valor%2 == 1) {
		System.out.println("O valor �: " + valor + "� um numero par");
	}else {
		System.out.println("Valor digitado incorreto: ");
	}
}*/