package lambdas;


@FunctionalInterface // N�o deixa criar mais de uma fun��o.
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() { // posso usar metodo default ou static
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}

}
