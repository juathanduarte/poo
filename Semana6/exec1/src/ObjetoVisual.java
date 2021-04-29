abstract class ObjetoVisual {
    float vida; // Varia entre 0, .25, .5, 1
    int pontuacao; // + 1 para cada acerto
    int pos_x; // Posicao no eixo x
    int pos_y; // Posicao no eixo y
    float largura; // Largura do objeto
    float altura; // Altura do objeto

    public ObjetoVisual(float vida, int pontuacao, int pos_x, int pos_y, float largura, float altura){
        this.vida = vida;
        this.pontuacao = pontuacao;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.largura = largura;
        this.altura = altura;
     }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void desenha(){

    }
}