public abstract class PessoaIMC extends Pessoa{
    // Campos protegidos
    protected double peso;
    protected double altura;
    // Método abstrato resultIMC() que não recebe parâmetros
    abstract String resultIMC();

    //Construtor recebendo duas Strings e dois double
    public PessoaIMC(String nome, String dataNascimento, double peso, double altura){
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    // Recebe como parâmetro dois valores do tipo double e retorna um valor do tipo double
    public double calculaIMC(double altura, double peso){
        return peso / Math.pow(altura, 2);
    }

    // toString retornando uma string
    @Override
    public String toString() {
        return (super.toString() + "\n" +
                "Peso: " + peso + "\n" + 
                "Altura: " + altura) + "\n" +
                resultIMC();
    }

    // Get's and Set's
    // Retorna peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Retorna altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
