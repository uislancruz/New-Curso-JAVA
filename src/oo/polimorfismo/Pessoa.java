package oo.polimorfismo;

public class Pessoa {
	
 private double peso;
	
	public Pessoa (double peso) {
		setPeso(peso);
	}
	
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso(peso);
	}
	
	public double getPeso(double peso) {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}

}
