package oo.composicao.heranca.desafio;

public class Ferrari extends Carro{
	
	public Ferrari(){
		
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
		delta = 15;
	}
	
	//com a declaração do delta dentro do contrutor, se faz desnecessario a parte de baixo
	
//	@Override
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}

}
