package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida variavelComida1 = new Comida("Arroz", 0.180);
		Comida variavelComida2 = new Comida("Feij�o", 0.300);
		
		Pessoa variavelPessoa = new Pessoa("Jo�o", 99.8);
		
		System.out.println(variavelPessoa.apresentar());
		variavelPessoa.comer(variavelComida1);
		
		System.out.println(variavelPessoa.apresentar());
		variavelPessoa.comer(variavelComida2);
		
		System.out.println(variavelPessoa.apresentar());
	}

}
