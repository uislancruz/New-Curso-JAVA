package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		geraErro1();
		geraErro2();
		
		System.out.println("FIM :)");
				
	}
	
	static void geraErro1() {
		
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}
	
	static void geraErro2() {
		new Exception("Ocorreu um erro bem legal #02!");
		
	}

}
