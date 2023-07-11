package ExercícioComposição;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	

	// metodo para simplificar > criar produto, item e adciona a compra.
	void addItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}

}
