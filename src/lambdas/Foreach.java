package lambdas;


import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
	}

}
