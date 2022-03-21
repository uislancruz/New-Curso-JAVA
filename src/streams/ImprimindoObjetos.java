package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucas", "Ana");
			System.out.println(aprovados);
			
			System.out.println(" ");
			
			System.out.println("Usando o foreach...");
			for(String nome: aprovados) {
				System.out.println(nome);
			}
			
			System.out.println("\nUsando Iterator...");
			
			Iterator<String> it = aprovados.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("\n\nUsando Stream");
			Stream<String> streams = aprovados.stream();
			streams.forEach(System.out::println);
		
	}

}
