public class Tigre implements Animal {
    @Override
    public void sono() {
        System.out.print("O tigre esta dormingo! zZzZz\n");
    }

    @Override
    public void comida() {
        System.out.print("O tigre esta comendo! / 1\n");
        System.out.print("O tigre esta comendo! / 2\n");
    }    
}
