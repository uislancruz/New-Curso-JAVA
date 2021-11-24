package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		
		DesafioData d1 = new DesafioData();
		
		d1.dia = 12;
		d1.mes = "Abril";
		d1.ano =1988;
		
		System.out.println("O Uislan nasceu no dia: "+ d1.dia + "\nDo mês: " +d1.mes+"\nDo ano: "+d1.ano);
		System.out.printf("%d/%s/%d", d1.dia, d1.mes, d1.ano);
	}

}
