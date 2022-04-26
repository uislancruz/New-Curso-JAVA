package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
		
		CaixaInt<String> caixaA = new CaixaInt<String>();
		caixaA.guardar("Teste");
		
		String coisa = caixaA.abrir();
		System.out.println(coisa);
	}
}
