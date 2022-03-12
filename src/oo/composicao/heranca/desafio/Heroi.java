package oo.composicao.heranca.desafio;

public class Heroi extends Jogador{
	
boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 0 && deltaY == 1) {
			
			oponente.vida -=20;
			
			}else if(deltaX == 1 && deltaY ==0) {
				
				oponente.vida -=20;
				
			}else {
				return false;
			}
		
		return true;
	}
	

}
