public class Bancos {
    float preco;
    String modelo, fabricante;

    Bancos() {
        this.preco = 0;
        this.modelo = "Insira o Modelo";
        this.fabricante = "Informe o fabricante";
    }

    Bancos(float preco, String modelo, String fabricante) {
        this.preco = preco;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }  
}
