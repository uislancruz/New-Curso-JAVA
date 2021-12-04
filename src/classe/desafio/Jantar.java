package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Comida variavelcomida1 = new Comida("Arroz", 0.180);
		Comida variavelcomida2 = new Comida("Feijão", 0.300);
		
		Pessoa variavelPessoa = new Pessoa("João", 99.8);
		
		System.out.println(variavelPessoa.apresentar());
		variavelPessoa.comer(variavelcomida1);
		
		System.out.println(variavelPessoa.apresentar());
		variavelPessoa.comer(variavelcomida2);
		
		System.out.println(variavelPessoa.apresentar());
	}

}
