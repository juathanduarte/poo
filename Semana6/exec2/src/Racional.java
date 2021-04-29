public class Racional extends Inteiro {
    int b;

    Racional (int x, int y) {
        super(x);
        b = y;
    }

    void add (Racional x) {
        a = a * x.b + b * x.a;
        b = b * x.b;
    }

    void inc () {
        a = a + b;
    }

    void print () {
        System.out.print(a);
        System.out.print("/");
        System.out.println(b);
    }
}