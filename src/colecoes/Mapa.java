package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");	
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");	
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));
		
		for(int pecorrendoChave: usuarios.keySet()) {
			System.out.println(pecorrendoChave);
		}
		
		for(String pecorrendoValor: usuarios.values()) {
			System.out.println(pecorrendoValor);
		}
		
	}

}
