public class Teste{
    public static void main(String[] a) {
        Inteiro i = new Inteiro(1);
        Racional r = new Racional(2,2);
        i = r; 
        i.inc(); 
        i.print();
        i.add(1); 
        i.print();
    }
}   