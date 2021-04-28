public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "Ele tem " + valorCredito + " R$ de saldo, "  
                + valorDivida + " R$ de dívida e " +
                + this.obterSaldo() + " R$ vai ser o saldo depois de pagar a dívida.\n");
    } 
}