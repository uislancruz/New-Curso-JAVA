package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adicionam elementos na fila
		// A diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
	}

}
