public class Lobo implements Animal {
    @Override
    public void sono() {
        System.out.print("O lobo esta dormingo! zZzZz\n");
    }

    @Override
    public void comida() {
        System.out.print("O lobo esta comendo! / 1\n");
        System.out.print("O lobo esta comendo! / 2\n");
    }    
}
