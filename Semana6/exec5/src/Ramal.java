public class Ramal extends Tel {
    private int numeroRamal;

    public Ramal(int ddd, int dddi, int telefone, int numeroRamal){
        super(ddd, dddi, telefone);
        this.numeroRamal = numeroRamal;
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }

    @Override
    public String toString() {
        return "Número do ramal: " + numeroRamal + "\n\n";
    }
}
