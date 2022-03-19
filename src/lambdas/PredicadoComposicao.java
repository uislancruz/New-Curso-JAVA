package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		//predicado � uma fun��o(interface) que recebe um parametro de entrada e retorna se � verdadeiro ou falso
		
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		System.out.println(isPar.or(isTresDigitos).test(123));
		
	}

}
