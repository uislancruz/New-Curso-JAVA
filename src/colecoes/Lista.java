package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		//pode ser feito desse jeito
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		// ou posso fazer assim 
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		for (Usuario u: lista) {
			System.out.println(u);
		}
	}
	

}
