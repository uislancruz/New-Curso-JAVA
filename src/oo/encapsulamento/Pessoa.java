package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String sobreNome;
	private String nome;
	
	public Pessoa(String nome,String sobreNome, int idade){
		
		setSobrenome(sobreNome);
		setNome(nome);
		setIdade(idade);
		
	}
	
	
	public String getSobrenome() {
		return sobreNome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobreNome = sobrenome;
	}


	//Getter
	public String getNome() {
		return nome;
	}
	//Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDadosCompletos() {
		
		return getNome() + " " + getSobrenome() + " " + getIdade();
	}


	//Getter
	public int getIdade() {
		
		return idade;
	}
		//Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		
		}
	}
	
	@Override
	public String toString() {
		
		return "Ola, eu sou o " + getNome() + getSobrenome() + " e tenho "+ getIdade();
	}

}
