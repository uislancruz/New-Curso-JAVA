package oo.composicao.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(){
		
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
		delta = 15;
	}
	
	//com a declara��o do delta dentro do contrutor, se faz desnecessario a parte de baixo
	
//	@Override
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}

}