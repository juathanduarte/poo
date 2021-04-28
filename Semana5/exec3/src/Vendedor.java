public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(
        String nome, 
        String endereco,
        String telefone, 
        int codigoSetor, 
        double salarioBase, 
        double imposto, 
        double valorVendas, 
        double comissao ){

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculoComissao() {
        return this.valorVendas * (this.comissao / 100);
    }

    public double salarioVendedor() {
        return this.calcularSalario() + this.calculoComissao();
    }

    @Override
    public String toString() {
        return (super.toString() +
                "O vendedor vendeu " + valorVendas +
                ", com uma comissão de " + this.calculoComissao() +
                " e no final do mês recebeu " + this.salarioVendedor() + "\n");
    }
}