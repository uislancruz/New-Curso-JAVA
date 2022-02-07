package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adicionam elementos na fila
		// A diferença é o comportamento ocorre quando a fila está cheia!
		
		fila.add("Ana"); // retorna false (caso não tenha dados algum na fila
		fila.offer("Bia");// Lança uma Exception (exceção)
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o proximo elementos da fila (sem remover)
		// A diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek());// retorna false(null)
		System.out.println(fila.peek());// Lança uma Exception (exceção)
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		//fila.size(); 
		//fila.clear(); limpar
		//fila.isEmpty(); saber se estar ou não vazia
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
