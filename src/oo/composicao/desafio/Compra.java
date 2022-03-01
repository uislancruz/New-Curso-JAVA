package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade ) {
		
		this.itens.add(new Item(p, quantidade));
		
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto,qtde));
	}
	
double obterValorTotal() {
		
		double total = 0;
		
		for(Item item: this.itens) {
			
			total += item.quantidade * item.produto.preco;
			
		}
			
		
		
		return total;

}
}