package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
			caixaA.guardar(2.3);
			
			Integer coisa = (Integer)caixaA.abrir();
			System.out.println(coisa);
		
	}

}
