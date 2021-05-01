public class Mouse extends Item {
	private double preco;
	
	public Mouse() {
		super();
		this.preco = 20.0;
	}
	
	public double retornaPreco() {
		return this.preco;
	}
	
	public String toString() {
		return "Mouse";
	}

}
