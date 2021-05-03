public class C3 extends C1 {
    double d=3.14;
    Float f;
    public Object cria(){
        d = d + 1.0;
        f = new Float(d);
        return f;
    }
    public void mostra() {
        System.out.print("f="+f);
    }
}
