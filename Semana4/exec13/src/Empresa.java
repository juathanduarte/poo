public class Empresa {
    private String nomeEmpresa = "UFPel";
    private String cnpjEmpresa = "01.439.701/0001-94";
    int matricula = 1;
    private int qntdFuncionario;
    private Funcionarios array[];

    public Empresa(String nomeEmpresa, String cnpjEmpresa, int funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        array = new Funcionarios[funcionarios];
        qntdFuncionario = funcionarios;
    }

    public Funcionarios getFuncionario(int matricula) {
        if (matricula <= qntdFuncionario && matricula >=1){
            return array[matricula - 1];
         } else {
             return null;
         }
    }

    public String infoFuncionario (int matricula) {
        Funcionarios func = getFuncionario(matricula);
        if (func != null) {
            String info = func.toString();

            return info + "\n" +
            "Matricula: " + matricula;
        }
        return "Funcionário não existe";
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public Funcionarios[] getFuncionarios() {
        return array;
    }

    public void criarFuncionario(String nome, String cpf, double salario) {
        if (matricula > qntdFuncionario) {
            System.out.printf("Número máximo de funcionários.");
            return;
        }
        Funcionarios funcionario = new Funcionarios(nome, cpf, salario, matricula);
        array[matricula - 1] = funcionario;
        matricula++;
    }
}
