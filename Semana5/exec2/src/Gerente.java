public class Gerente extends Empregado {
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return (super.toString() + 
                " com o valor de inss sendo " + this.valorInss() +
                " com nome de " + nomeGerencia + "\n");
    }

}
