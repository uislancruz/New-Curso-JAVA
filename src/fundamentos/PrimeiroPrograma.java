package fundamentos;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; //usa-se final para impedir de que a variavel mude de valor
		
		double area = PI * raio * raio ;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " +area+" m2");
		
		
		
	}
	

}

