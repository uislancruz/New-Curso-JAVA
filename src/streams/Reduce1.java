package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumuladorVariavel, nVariavel)
				-> acumuladorVariavel + nVariavel;
		
		int total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		//Integer total2 = nums.parallelStream().reduce(100, soma);//com o parallelStream ele coloca o valor inicial em cada chamada. Na lista tem 9 elemento, então ele colocou o 100 nove vezes.
		Integer total2 = nums.stream().reduce(100, soma);//com stream apenas, ele colocar o valor inicial apenas na primeira chamada.
		System.out.println(total2);
		
		
		//Resultado foi um Opcional<Integer>...
		nums.stream()
		.filter(nVariavel2 -> nVariavel2 > 5)
		.reduce(soma)
		.ifPresent(System.out::println);
		
		
	}

}
