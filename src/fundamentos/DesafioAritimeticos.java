package fundamentos;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		double num1 = 6;
		double num2 = 3+2;
		double divisor1 = 3*2;
		
		double segnum1 = 1-5;
		double segnum2 = 2-7;
		double segdivisor = 2;
		
		double grandedivisor = Math.pow(10, 3);
		
		double calc1 = Math.pow(num1 * num2, 2);
		
		double calc2 = calc1 / divisor1;
		
		
		double segcalc1 = (segnum1 * segnum2) / segdivisor;
		
		double segcalc2 = Math.pow(segcalc1, 2);
		
		double total1 = calc2 - segcalc2;
		
		
		double grandedivisor2 = Math.pow(total1,3);
		
		double resposta = grandedivisor2 / grandedivisor; 
		
		
		
		
		System.out.println(grandedivisor2);
		System.out.println(grandedivisor);
		System.out.println(resposta);
		
		
	}

}
