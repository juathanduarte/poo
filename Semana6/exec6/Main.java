public class Main {
	public static void main(String[] args) {
		MonitorVideo monitor = new MonitorVideo();
		Mouse mouse = new Mouse();
		PlacaMemoria ram = new PlacaMemoria(4);
		Processador cpu = new Processador();
		Teclado teclado = new Teclado();
		
		Gabinete gabinete = new Gabinete();
		Computador pc = new Computador();
		
		gabinete.addItem(monitor);
		gabinete.addItem(cpu);
		pc.addItem(gabinete);
		pc.addItem(pc);
		pc.addItem(teclado);
		System.out.println(pc.retornaPreco());
		System.out.println(gabinete.retornaPreco());
		System.out.println(mouse.retornaPreco());
		System.out.println(ram.retornaPreco());
	}
}
