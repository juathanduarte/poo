public class Cachorro implements Animal{
    @Override
    public void sono() {
        System.out.print("O cachorro esta dormingo! zZzZz\n");
    }

    @Override
    public void comida() {
        System.out.print("O cachorro esta comendo! / 1\n");
        System.out.print("O cachorro esta comendo! / 2\n");
    }    
}