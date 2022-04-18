package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeForaIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		
		return String.format("O atributo %s está negativo", nomeDoAtributo);
	}

}
