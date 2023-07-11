package ExercícioComposição;

public class Sistema {

	public static void main(String[] args) {
		
		
		
		Compra c1 = new Compra();
		c1.addItem("Caneta", 9.89, 100);
		c1.addItem("Computador", 1897.33, 2);
		
		Compra c2 = new Compra();
		c2.addItem("Caderno", 10, 10);
		c2.addItem("Impressora", 998.90, 1);
		
		Cliente cliente1 = new Cliente("Maria");
		cliente1.compras.add(c1);
		cliente1.compras.add(c2);
		
		System.out.println();

	}

}
