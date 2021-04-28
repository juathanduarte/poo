public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(
        String nome, 
        String endereco, 
        String telefone, 
        int codigoSetor, 
        double salarioBase,
        double imposto, 
        double valorProducao, 
        double comissao) {

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculoComissao() {
        return valorProducao * (this.comissao / 100);
    }

    public double calculoSalarioMaisComissao() {
        return this.calcularSalario() + this.calculoComissao();
    }

    @Override
    public String toString() {
        return (super.toString() +
                "O operário recebe " + calculoComissao() + " de comissão" +
                ", equivalente a " + valorProducao + " de produção " +
                ", com um salário total de " + calculoSalarioMaisComissao() + "\n");
    }
}