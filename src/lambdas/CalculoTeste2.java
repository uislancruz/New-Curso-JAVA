package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {return x + y; }; //Lambda
		
		System.err.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;//Lambda pode ser assim omitindo o return sem {return}
		
	}

}
