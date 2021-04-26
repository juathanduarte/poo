public class Pneus {
    float preco;
    String tipo, fabricante;

    Pneus() {
        this.preco = 0;
        this.tipo = "Insira o tipo";
        this.fabricante = "Informe o fabricante";
    }

    Pneus(float preco, String tipo, String fabricante) {
        this.preco = preco;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }
}
