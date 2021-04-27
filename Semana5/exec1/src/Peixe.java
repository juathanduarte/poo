public class Peixe extends Animal {
    private String tipoHabitat;

    // Construtor
    public Peixe(String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return super.toString() + " e de habitat " + tipoHabitat;
    }
}
