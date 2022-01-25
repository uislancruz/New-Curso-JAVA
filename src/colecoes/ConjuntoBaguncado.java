package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double ( converte para uma classe)
		conjunto.add(true); //boolean -> Boolean ( converte para uma classe)
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		//caso eu add um novo elemeto reptido, ele n�o alterar� a quantidade do conjunto. 
		//Ex:
		
		conjunto.add("Teste"); // aqui o elemento dentro � o mesmo que a linha 11. Por isso n�o acrescenta.
		conjunto.add("teste"); // aqui acrescenta pois os valores s�o diferente (T e t) lembrando que o JAVA � case sensitive 
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));// se foi removido ele retornar� true, pois � tipo boolean, caso n�o, false
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho � " + conjunto.size());
		System.out.println(conjunto.contains("teste"));// como eu removi a cima o "teste", ele retornar� false, pois n�o tem 
		
		
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		//conjunto.addAll(numeros); // Uni�o entre dois conjuntos
		
		conjunto.retainAll(numeros);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
