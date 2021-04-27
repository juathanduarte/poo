public class MatrizDeInteiros {

    private final int[][] matriz;
    private final int nLin;
    private final int nCol;

    public MatrizDeInteiros(int lin, int col) {
        nLin = lin;
        nCol = col;
        matriz = new int[lin][col];
    }

    public void insereValor(int lin, int col, int valor) {
        if(lin > nLin || lin < 1 || col > nCol || col < 1)
            System.out.println("Posição inválida.");
        else
            matriz[lin-1][col-1] = valor;
    }

    public boolean ehQuadrada() {
        return nCol == nLin;
    }

    public int somaValores() {
        int total = 0;

        for(int i = 0; i < nLin; i++)
            for(int j = 0; j < nCol; j++)
                total += matriz[i][j];
 
        return total;
    }

    public int buscaValor(int valor) {
        // Usa um ArrayList se tu quiser guardar todas as linhas que possuem esse valor.

        for (int i = 0; i < nLin; i++)
            for (int j = 0; j < nCol; j++)
                if (matriz[i][j] == valor){
                    return i+1;
                }

        return -1;
    }

}
