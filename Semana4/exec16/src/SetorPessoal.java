import java.util.Arrays;
import java.util.Comparator;

public class SetorPessoal {
    int i = 0;
    Funcionario[] array;
    int numFuncionarios;

    public SetorPessoal(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
        array = new Funcionario[numFuncionarios];
    }

    public void criarFuncionario(int matricula, String nome, int departamento, float salario, String funcao) {
        if (i >= numFuncionarios) {
            System.out.printf("Número máximo de funcionários.");
            return;
        }
        Funcionario funcionario = new Funcionario(matricula, nome, departamento, salario, funcao);
        array[i] = funcionario;
        i++;
    }

    public void criarFolha (){
        for( int i = 0 ; i < numFuncionarios ; i++) {
            System.out.printf("Nome: %s -> Salário: %.2f \n", array[i].nome, array[i].salario);
        }
    }

    public void totalFolha (){
        float contadorSalario = 0;

        for( int i = 0 ; i < numFuncionarios ; i++) {
            contadorSalario = contadorSalario + array[i].salario;
            contadorSalario++;
        }

        System.out.printf("Total da folha: %.2f \n", contadorSalario);
    }

    public void maiorSalario (){
        float maiorSalario = 0;
        String nomeMaiorSalario = null;

        for( int i = 0 ; i < numFuncionarios ; i++) {
            if(array[i].salario > maiorSalario) {
                maiorSalario = array[i].salario;
                nomeMaiorSalario = array[i].nome;
            }
        }
        System.out.printf("O %s tem o maior salário de %.2f \n", nomeMaiorSalario, maiorSalario);
    }

    public void listaDepartamento (int departamento){
        for( int i = 0 ; i < numFuncionarios ; i++) {
            if (departamento == array[i].departamento) {
                System.out.printf("Nome: %s & Cargo: %s \n", array[i].nome, array[i].funcao);
            }
        }
    }

    public void listaFuncao (String funcao){
        for( int i = 0 ; i < numFuncionarios ; i++) {
            if (funcao == array[i].funcao) {
                System.out.printf("Nome: %s exerce a função %s \n", array[i].nome, array[i].funcao);
            }
        }
    }

    public void folhaPagamento (){

        Arrays.sort(array, Comparator.comparing(Funcionario::getSalario));

        for( int i = 0 ; i < numFuncionarios ; i++) {
            System.out.printf("Nome: %s -> Salário: %s \n", array[i].nome, array[i].salario);
        }
    }
}
