public class Teclado extends Item {
	private double preco;
	
	public Teclado() {
		super();
		this.preco = 30.0;
	}
	
	double retornaPreco() {
		return this.preco;
	}

	public String toString() {
		return "Teclado";
	}

}
