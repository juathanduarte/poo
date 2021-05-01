public class PlacaMemoria extends Item {
	private double preco;
	private int capacidade;
	
	public PlacaMemoria(int capacidade) {
		super();
		this.preco = 50.0;
		this.capacidade = capacidade;
	}
	
	public double retornaPreco() {
		return this.preco * this.capacidade;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public void alterarCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public String toString() {
		return "Placa de Memória";
	}
}
