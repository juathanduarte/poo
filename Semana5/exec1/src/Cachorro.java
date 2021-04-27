public class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + " de raça " + raca;
    }
}
