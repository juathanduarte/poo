public class Administrador extends Empregado {
    private double ajudaDeCusto;

   public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
       super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
       this.ajudaDeCusto = ajudaDeCusto;
   } 

   public double ajudaDeCusto(){
       return this.calcularSalario() + this.ajudaDeCusto;
   }

@Override
public String toString() {
    return (super.toString() +
    "O funcionário " + this.getNome() +
    " tem uma ajuda de custo de " + ajudaDeCusto +
    ", então o salário fica " + this.ajudaDeCusto() + "\n");
}

}