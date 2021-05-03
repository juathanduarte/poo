public class C2 extends C1 {
    static int i = 0;
    Integer j;
    public Object cria() {
        i++;
        j = new Integer(i);
        return j;
    }
    public void mostra() {
        System.out.print("j=" + j);
    }
}