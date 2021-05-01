public abstract class Item {
	private static int codigoItem = 1;
	private int codigo;
	
	public Item() {
		this.codigo = codigoItem++;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	abstract double retornaPreco();
}
