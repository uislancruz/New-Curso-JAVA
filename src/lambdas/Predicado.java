package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		

	Predicate<Produto> isCaro = produtoVariavel -> 
			(produtoVariavel.preco * (1 - produtoVariavel.desconto)) >= 750;
	
	
	Produto produto = new Produto("Notebook", 3893.89, 0.15);
	
	System.out.println(isCaro.test(produto));
	

}
}
