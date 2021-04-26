public class Motor {
    float potencia, preco;
    String fabricante;

    Motor() {
        this.preco = 0;
        this.potencia = 0;
        this.fabricante = "Informe o fabricante";
    }

    Motor(float preco, float potencia, String fabricante) {
        this.preco = preco;
        this.potencia = potencia;
        this.fabricante = fabricante;
    }
}
