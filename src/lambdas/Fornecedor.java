package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		//por n�o receber nenhum parametro, colocamos os ().
		
		System.out.println(umLista.get());
	}

}
