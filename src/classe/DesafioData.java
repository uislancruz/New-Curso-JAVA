package classe;

public class DesafioData {
	
	int dia;
	String mes;
	int ano;
	
	
	DesafioData(){
		
		//usando o this(); usando o this() como metodo
		//dia = 1;
		//mes = "Janeiro";
		//ano = 1970;
		
		this(1,"Janeiro",1970);
	}
	
	DesafioData(int dia, String mes, int ano){
		//dia = diaInicial;
		//mes = mesInicial;
		//ano = anoInicial;
		
		//usando o this; usando o this para referenciar
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%s/%d";
		return String.format(formato, dia, mes, ano);
	
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
		
}
