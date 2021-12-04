package classe;

public class DesafioData {
	
	int dia;
	String mes;
	int ano;
	
	
	DesafioData(){
		
		//usando o this();
		//dia = 1;
		//mes = "Janeiro";
		//ano = 1970;
		
		this(1,"Janeiro",1970);
	}
	
	DesafioData(int dia, String mes, int ano){
		//dia = diaInicial;
		//mes = mesInicial;
		//ano = anoInicial;
		
		//usando o this;
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String obterDataFormatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
	
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
		
}
