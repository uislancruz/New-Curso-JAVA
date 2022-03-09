package oo.composicao.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(){
		
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
	}
	
	@Override
	void acelerar() {
		
		velocidadeAtual += 15;
	}

}
