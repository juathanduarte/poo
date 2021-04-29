public class Aviao extends ObjetoVisual {

    public Aviao(float vida, int pontuacao, int pos_x, int pos_y, float largura, float altura, int x, int y){
        super(vida, pontuacao, pos_x, pos_y, largura, altura);
    }

    void movimenta (int x, int y) {
        pos_x = x;
        pos_y = y;
        }
}