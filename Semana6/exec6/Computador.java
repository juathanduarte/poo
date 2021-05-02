public class Computador extends ItemMontado {
	private int MAX_ITENS = 4;
	private double preco;
	
	public Computador() {
		this.conjItens = new Item[this.MAX_ITENS];
		this.index = 0;
		this.preco = 0.0;
	}
	
	public void addItem(Item item) {
		if (this.index < this.MAX_ITENS) {
			if (item.toString().equals("Placa de Memória") ||
				item.toString().equals("Processador") ||
				item.toString().equals("Computador")) {
				System.out.println("Uma placa de memória, um processador e um computador não podem fazer parte de um computador.");
				return;
			}
			this.conjItens[this.index] = item;
			this.preco += item.retornaPreco();
			this.index++;
			System.out.println(item.toString() + " adicionado.");
			return;
		} 
		
		System.out.println("O computador só pode ter 4 itens.");
	}
	
	public double retornaPreco() {
		return this.preco;
	}

	public String toString() {
		return "Computador";
	}

}
