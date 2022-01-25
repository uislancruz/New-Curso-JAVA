package colecoes;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> listaAprovados = new HashSet<String>();
		//Set<String> lista = new HashSet<>(); posso deixar no hashset <> que ja copia: chamado de Diamond
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String nomeCandidato: listaAprovados) {
			System.out.println(nomeCandidato);
		}
	}

}
