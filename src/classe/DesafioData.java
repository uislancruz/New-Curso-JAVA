package classe;

public class DesafioData {
	
	int dia;
	String mes;
	int ano;
	
	
	DesafioData(){
		
	}
	
	DesafioData(int diaInicial, String mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
	
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	
}
