public class Gato implements Animal {

    @Override
    public void sono() {
        System.out.print("O gato esta dormingo! zZzZz\n");
    }

    @Override
    public void comida() {
        System.out.print("O gato esta comendo! / 1\n");
        System.out.print("O gato esta comendo! / 2\n");
    }    
}