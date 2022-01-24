package colecoes;

import java.util.HashSet;

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
		
		
		
	}

}
