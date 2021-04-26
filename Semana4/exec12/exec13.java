import java.util.Scanner; 

public class exec13 {
    public static void main(String[] args) throws Exception {
        // Valores da matriz;
        int n, m;

        Scanner in = new Scanner(System.in);

        // Valor em X;
        System.out.println("\nDigite a quantidade de linhas:");
        n = in.nextInt();

        // Valor em Y;
        System.out.println("\nDigite a quantidade de colunas:");
        m = in.nextInt();

        // Declaração da matriz;
        int array [][] = new int [n][m];

        System.out.println("--Matriz--");
	    for (int i = 0; i < n; i++) {
            System.out.println(n);
		    for (int a = 0; a < m; a++) {
			    System.out.println("Digite a linha: " + n + " Digite a Coluna: " + m);
			    array[n][m] = in.nextInt();
		    }
	    }

        //for (int i = 0; i < n; i++) {
          //  for (int a = 0; a < m; a++) {
                
                /*Imprime 'bonitinho'(Formatado)*/
           //     System.out.printf("%3d   ", array[n][m]);
          //  }
           // System.out.println();
       // }

        //for (int i = 0; i < array.length; i++) {
           // for (int h = 0; h < array.length -1; h++) {
           //     array [i][h] = i * h;
         //   }
       // System.out.print(array[i][i] + "\n");
       // }

        in.close();
    }
}