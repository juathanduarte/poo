public class App {
    public static void main(String[] args) throws Exception {
       Animal animal1 = new Animal("Animal", 60); 
       Cachorro cachorro1 = new Cachorro("Dog", 61, "Vira-lata");
       Peixe peixe1 = new Peixe("Peixe", 59, "Água");

       System.out.println(animal1.toString());
       System.out.println(cachorro1.toString());
       System.out.println(peixe1.toString());
    }
}
