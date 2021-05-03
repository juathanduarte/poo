public class Leao implements Animal {
    @Override
    public void sono() {
        System.out.print("O leão esta dormingo! zZzZz\n");
    }

    @Override
    public void comida() {
        System.out.print("O leão esta comendo! / 1\n");
        System.out.print("O leão esta comendo! / 2\n");
    }    
}
