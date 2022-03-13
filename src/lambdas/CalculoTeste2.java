package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {return x + y; };
		
		System.err.println(calc.executar(2, 3));
		
	}

}
