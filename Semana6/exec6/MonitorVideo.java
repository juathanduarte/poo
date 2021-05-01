public class MonitorVideo extends Item {
	private double preco;
	private double tamanho;
	
	public MonitorVideo(double tamanho) {
		super();
		this.preco = 350;
		this.tamanho = tamanho;
	}
	
	public MonitorVideo() {
		this(0.0);
	}

	public double retornaPreco() {
		return this.preco;
	}
	
	public void alterarTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		return "Monitor de Vídeo";
	}
}
