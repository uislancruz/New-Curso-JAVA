package oo.composicao.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	public Ferrari(){
		
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo() {
		
		setDelta(35);
		
	}
	
	public void desligarTurbo() {
		setDelta(15);
		
	}
	
	public void ligarAr() {
		
	}
	
	public void desligarAr() {
		
	}
	
	//com a declaração do delta dentro do contrutor, se faz desnecessario a parte de baixo
	
//	@Override
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}

}
