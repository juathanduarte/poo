public class Inteiro {
    int a;

    Inteiro (int x) {
        a = x;
    }

    void add (int x) {
        a = a + x;
    }

    void inc () {
        a = a + 1;
    }

    void print () {
        System.out.println(a);
    }
}