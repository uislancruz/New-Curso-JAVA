package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
	
		Produto p1 = new Produto("NoteBook", 4356.89);
		
				
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//double precoFinal1 = p1.precoComDesconto();
		//double precoFinal2 = p2.precoComDesconto(0.1);
		
		double mediaCarrinho = ((p1.preco + p2.preco)/2);
		double descFinal =  mediaCarrinho - (mediaCarrinho * Produto.desconto);
		
		System.out.printf("M?dia do carrinho = R$%.2f", mediaCarrinho);
		System.out.printf("\nPre?o final com desconto = R$%.2f", descFinal);
		
		
	}

}
