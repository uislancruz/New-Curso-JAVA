package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adicionam elementos na fila
		// A diferen�a � o comportamento ocorre quando a fila est� cheia!
		
		fila.add("Ana"); // retorna false (caso n�o tenha dados algum na fila
		fila.offer("Bia");// Lan�a uma Exception (exce��o)
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o proximo elementos da fila (sem remover)
		// A diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.peek());// retorna false(null)
		System.out.println(fila.peek());// Lan�a uma Exception (exce��o)
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		//fila.size(); 
		//fila.clear(); limpar
		//fila.isEmpty(); saber se estar ou n�o vazia
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
