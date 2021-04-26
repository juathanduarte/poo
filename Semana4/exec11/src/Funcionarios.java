public class Funcionarios {
    private String nome = "";
    private String cpf = "";
    private double salario = 0;


    /* Construtor opcional, sem nome */
    public Funcionarios (String cpf, Double salario, int matricula) {
        this.nome = "";
        this.cpf = cpf;
        this.salario = salario;
    }

    /* Construtor opcional, com nome */
    public Funcionarios (String nome, String cpf, Double salario, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n\nCPF:" + cpf + "\nNome:" + nome + "\nSalario:" + salario;
    }
}