package oo.composicao.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarTurbo() {
		
		ligarTurbo = true;
		
	}
	
	public void desligarTurbo() {

		ligarTurbo = false;
		
	}
	
	public void ligarAr() {
		
		ligarAr = true;
		
	}
	
	public void desligarAr() {
		ligarAr = false;
		
	}

	@Override
	public int getDelta() {

		if(ligarTurbo && ligarAr) {
			return super.getDelta();
		
			} else if(ligarTurbo && ligarAr) {
				return 30;
				
		}else{
			return 15;
		}
		
		
	}
	
	
	
	
	
	//com a declaração do delta dentro do contrutor, se faz desnecessario a parte de baixo
	
//	@Override
//	void acelerar() {
//		
//		velocidadeAtual += 15;
//	}

}
