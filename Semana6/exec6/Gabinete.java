public class Gabinete extends ItemMontado {
	private int MAX_ITENS = 3;
	private double preco;

	public Gabinete() {
		this.conjItens = new Item[this.MAX_ITENS];
		this.index = 0;
		this.preco = 0.0;
	}
	
	public void addItem(Item item) {
		if (this.index < this.MAX_ITENS) {
			if (item.toString().equals("Placa de Memória") ||
				item.toString().equals("Processador")) {
				this.conjItens[this.index] = item;
				this.preco += item.retornaPreco();
				this.index++;
				System.out.println(item.toString() + " adicionado.");
				return;
			}
			System.out.println("Um gabinete só pode ser montado por placas de mem�ria e processadores.");
			return;
		} 
		
		System.out.println("O gabinete só pode ter 3 itens.");
	}
	
	public double retornaPreco() {
		return this.preco;
	}

	public String toString() {
		return "Gabinete";
	}
}
