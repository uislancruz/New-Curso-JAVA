package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		
		DesafioData d1 = new DesafioData();
		
		d1.dia = 12;
		d1.mes = "Abril";
		d1.ano =1988;
		
		var d2 = new DesafioData();
		
		d2.dia = 31;
		d2.mes = "Dezembro";
		d2.ano = 2021;
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
		//System.out.println(d1.obterDataFormatada());
		//System.out.println(d2.obterDataFormatada());
		
	}

}
