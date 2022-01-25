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
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//caso eu add um novo elemeto reptido, ele não alterará a quantidade do conjunto. 
		//Ex:
		
		conjunto.add("Teste"); // aqui o elemento dentro é o mesmo que a linha 11. Por isso não acrescenta.
		conjunto.add("teste"); // aqui acrescenta pois os valores são diferente (T e t) lembrando que o JAVA é case sensitive 
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));// se foi removido ele retornará true, pois é tipo boolean, caso não, false
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.contains("teste"));// como eu removi a cima o "teste", ele retornará false, pois não tem 
		
		
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		//conjunto.addAll(numeros); // União entre dois conjuntos
		
		conjunto.retainAll(numeros);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
