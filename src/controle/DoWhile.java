package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		//if(condi��o enquanto); sentenca; ou{} 
		//while(...) sentenca; ou{}
		//for(inicializa��o de variavel;expressao; modifica�ao da variavel) sentenca;ou{}
		
		//do {} while(expressoa); --> unica que termina com ";"
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras magicas");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		entrada.close();
	}

}
