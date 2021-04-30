import java.util.ArrayList;

public class Contato {
    private String nome;
    private String endereco;
    private ArrayList<Tel> telefones;

    public Contato(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        telefones = new ArrayList<>();
    }

    public void adicionaTelefone(Tel telefone){
        telefones.add(telefone);
    }

    public void printaContato(){
        
        System.out.print("Nome: " + nome + "\n" + "Endereço: " + endereco + "\n");
        for(Tel telefone : telefones) {
            System.out.print(telefone.toString());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}