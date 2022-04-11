package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		geraErro2();
		
		System.out.println("FIM :)");
				
	}
	//N�o checada ou n�o verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}
	
	static void geraErro2() {
		new Exception("Ocorreu um erro bem legal #02!");
		
	}

}
