public class App {
    public static void main(String[] args) throws Exception {
        Pedido teste = new Pedido(180, "Juathan", "Jogador de CS:GO");
        System.out.printf("%d \n%s \n%s", teste.codigoPedido, teste.clienteNome, teste.descricao);
    }
}
