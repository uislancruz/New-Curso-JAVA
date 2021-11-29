package classe;

public class DesafioData {
	
	int dia;
	String mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
	
}
}
