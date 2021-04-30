public class Cilindro extends figuras3D {
    private double raio;
    private double altura;

    //Construtor extendendo ObjetosGeometricos
    public Cilindro(double altura, double raio){
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.round(2 * Math.PI * Math.pow(raio, 2));
    }

    @Override
    public double volume() {
        return Math.round(Math.PI  * (raio * raio) * altura);
    }

    //Get's & Set's
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}