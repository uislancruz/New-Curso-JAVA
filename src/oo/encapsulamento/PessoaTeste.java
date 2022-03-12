package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", -30);
		p1.setNome("Pedro");	
		p1.setIdade(30);	
		
		System.out.println(p1.getNome()+"\n" +p1.getIdade());//ler normal
		System.out.println(p1);//quando vc denomina o ToString(muito melhor)
}
}