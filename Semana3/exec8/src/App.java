public class App {
    public static void main(String[] args) throws Exception {
        Bancos banco1 = new Bancos(800, "Slim", "Casas Bahia");
        Motor motor1 = new Motor(7000, 16, "Renault");
        Pneus pneu1 = new Pneus(700, "De corrida", "Ferrari");
        Carro carro1 = new Carro(pneu1.preco, motor1.preco, banco1.preco);

        System.out.printf("R$ %.2f", carro1.valorCarro());
        
    }
}
