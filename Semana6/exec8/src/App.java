public class App {
    public static void main(String[] args) throws Exception {
        Homem homem1 = new Homem("Juathan", "31/10/1998", 85, 1.70);
        Mulher mulher1 = new Mulher("Maria", "05/07/1970", 70, 1.60);

        System.out.println(homem1.toString());
        System.out.println("\n----------------\n");
        System.out.println(mulher1.toString());
    }
}