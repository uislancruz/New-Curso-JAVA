package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.nomeCliente = "João Pedro";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());//para verificar quantos items foram add
		System.out.println(compra1.obterValorTotal());//foi criado um metodo na classe compra, para que possa ser feito o calculo de quantidade x valor.
		
	}
	

}
