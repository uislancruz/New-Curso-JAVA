package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<String>();
		//Set<String> lista = new HashSet<>(); posso deixar no hashset <> que ja copia: chamado de Diamond
		SortedSet<String> listaAprovados = new TreeSet<String>();//Para manter a ordem com que foram add
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String nomeCandidato: listaAprovados) {
			System.out.println(nomeCandidato);
		}
	}

}
