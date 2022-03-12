package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	
	public Pessoa(int idade){
		this.idade = idade;
		
	}
	
	public int lerIdade() {
		
		return idade;
	}
		
	public void alterarIdade(int novaIdade) {
		this.idade = novaIdade;
		
	}

}
