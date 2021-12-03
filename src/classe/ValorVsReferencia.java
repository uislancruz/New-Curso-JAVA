package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DesafioData d1 = new DesafioData(1,"junho",2022);
		DesafioData d2 = d1;
		
		d1.dia = 31;
		d2.mes = "Dez";
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}

}
