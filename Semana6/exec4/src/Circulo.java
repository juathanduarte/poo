public class Circulo extends figuras2D {
    //Atributos do Circulo
    private double raio;

    //Construtor extendendo ObjetosGeometricos
    public Circulo(double base, double altura, double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.round(2 * (Math.PI * (raio * raio)));
    }

    @Override
    public double perimetro() {
        return Math.round(2 * (Math.PI * raio));
    }

    //Get's & Set's
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}