import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int matricula;

        Scanner ler = new Scanner(System.in);

        Empresa empresa1 = new Empresa("UFPel", "0564089981984", 10);

        empresa1.criarFuncionario("Juathan0", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan1", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan2", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan3", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan4", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan5", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan6", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan7", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan8", "04016774004", 1250.10);
        empresa1.criarFuncionario("Juathan9", "04016774004", 1250.10);

        System.out.printf("Informe a matrícula do funcionário:");
        matricula = ler.nextInt();

        Funcionarios funcionario1 = empresa1.getFuncionario(matricula);

        if (funcionario1 != null) {
            System.out.println(empresa1.infoFuncionario(matricula));
        } else {
            System.out.println("Inválido");
        }
        ler.close();
    }
}