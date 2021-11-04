package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Informe o primeiro salario: ");
	String valor1 = teclado.next().replace(",",".");
	
	System.out.println("Informe o primeiro salario: ");
	String valor2 = teclado.next().replace(",",".");
	
	System.out.println("Informe o primeiro salario: ");
	String valor3 = teclado.next().replace(",",".");
	
	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);
	
	double media = (salario1 + salario2 + salario3)/3;
	System.out.println("A média dos salário é: "+media);
	

}
}
