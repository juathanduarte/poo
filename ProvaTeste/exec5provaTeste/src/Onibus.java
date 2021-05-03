public abstract class Onibus extends Transporte {
    public int passageiros = 0;
    public void exibeDados() {
        System.out.println("Onibus: "+passageiros);
    }
}