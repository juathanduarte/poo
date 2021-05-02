public class Mulher extends PessoaIMC{
    public Mulher(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    String resultIMC() {
        if (super.calculaIMC(altura, peso) < 20.7){
            return "Abaixo do peso ideal";
        } else if (super.calculaIMC(altura, peso) < 26.4 && super.calculaIMC(altura, peso) > 20.7){
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
