package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	final boolean bomComportamente;
	
	
	public Aluno(String nome, double nota) {
		
		 this(nome, nota, true);
		 
		
	}
	
	public Aluno(String nome, double nota, boolean bomComportamente) {
		
		 this.nome = nome;
		 this.nota = nota;
		 this.bomComportamente = bomComportamente;
		
	}
	

	@Override
	public String toString() {
		
		return nome + " Tem nota " + nota;
	}
	

}
