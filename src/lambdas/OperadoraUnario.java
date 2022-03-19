package lambdas;

import java.util.function.UnaryOperator;

public class OperadoraUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n +2;
		UnaryOperator<Integer> vezesDois = n -> n *2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois // excecute essa
				.andThen(vezesDois)// depois excecute essa
				.andThen(aoQuadrado)// e depois essa
				.apply(0);
		
		//anThen é para fazer composição de função
		
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado2);
		
	}

}
