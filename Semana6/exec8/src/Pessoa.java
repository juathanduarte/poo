public class Pessoa {
    //Campos protegidos (encapsulados)
    protected String nome;
    protected String dataNascimento;
    
    // Construtor que recebe como parâmentros duas strings
    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // toString retornando o objeto da classe String
    @Override
    public String toString() {
        return ("Nome da pessoa: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento);
    }

    //Get's and Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}