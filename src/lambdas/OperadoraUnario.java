package lambdas;

import java.util.function.UnaryOperator;

public class OperadoraUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n +2;
		UnaryOperator<Integer> vezesDois = n -> n *2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		//anThen � para fazer composi��o de fun��o
		
		System.out.println(resultado1);
		
	}

}
