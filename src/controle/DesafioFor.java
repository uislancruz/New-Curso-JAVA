package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		//int laco1 = 1;
		//int laco2 = 5;
		
		//for(int i = laco1; i <= laco2; i++) {
		for(int i = 1; i<=5;i++) {
			System.out.println(valor);
			
			valor += "#";
		}
		
		//Fazendo um for sem usar numeros, apenas string
		
		for(String v = "#";!v.equals("######"); v+="#") {
			System.out.println(v);
		}
		
	}

}
