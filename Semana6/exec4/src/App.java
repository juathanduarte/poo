public class App {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(8, 8);
        Caixa c = new Caixa(8, 8, 8);
        Circulo co = new Circulo(8, 8, 5);
        Cilindro cl = new Cilindro(8, 5);

        System.out.print("Área do Retângulo " + r.area() + "\n");
        System.out.print("Perímetro do Retângulo " + r.perimetro() + "\n\n");

        System.out.print("Volume da caixa "  + c.volume() + "\n") ;
        System.out.print("Área da caixa "  + c.area() + "\n\n") ;

        System.out.print("Área do circulo "  + co.area() + "\n") ;
        System.out.print("Perímetro do circulo "  + co.perimetro() + "\n\n") ;

        System.out.print("Área do cilindro "  + cl.area() + "\n") ;
        System.out.print("Volume do cilindro "  + cl.volume() + "\n\n") ;

        ComparaObjeto.comparaArea(r.area(), c.area());
        ComparaObjeto.comparaVolume(cl.volume(), c.volume());;
    }
}
