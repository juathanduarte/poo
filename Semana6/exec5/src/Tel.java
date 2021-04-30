public class Tel {
    private int ddd;
    private int dddi;
    private int telefone;

    public Tel(int ddd, int dddi, int telefone){
        this.ddd = ddd;
        this.dddi = dddi;
        this.telefone = telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDddi() {
        return dddi;
    }

    public void setDddi(int dddi) {
        this.dddi = dddi;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "DDD: " + ddd + " | DDDI: " + dddi + " | Telefone: " + telefone + "\n";
    }
}