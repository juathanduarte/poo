public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();
        System.out.println(contador.getContador());
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador.getContador());
        contador.zerar();
        System.out.println(contador.getContador());
    }
}
