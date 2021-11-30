package classe;

public class DesafioData {
	
	int dia;
	String mes;
	int ano;
	
	
	DesafioData(){
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
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
