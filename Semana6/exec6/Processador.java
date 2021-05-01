public class Processador extends Item {
	private double preco;
	private String modelo;
	
	public Processador(String modelo) {
		super();
		this.preco = 150.0;
		this.modelo = modelo;
	}
	
	public Processador() {
		this("");
	}
	
	public double retornaPreco() {
		return this.preco;
	}
	
	public void alterarModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String toString() {
		return "Processador";
	}
}
