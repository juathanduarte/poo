import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite quantas posições quer que o vetor tenha:");
        n = in.nextInt();

        // declaração do vetor
        int [] vetor1 = new int[n];
        int [] vetor2 = new int[n];
        int [] vetor3 = new int[n];

        //declaração das variáveis
        // int x, y;
        
        //entrada de dados -> vetor1
        for (int i = 0; i< vetor1.length; i++) {
            vetor1[i] = i;
            System.out.print("Vetor 1 = " + vetor1[i] + "\n");
        }

        System.out.print("\n");

        //entrada de dados -> vetor2
        for (int i = 0; i< vetor2.length; i++) {
            vetor2[i] = i;
            System.out.print("Vetor 2 = " + vetor2[i] + "\n");
        }

        for (int i = 0; i < vetor3.length; i++){
            vetor3[i] = vetor2[i] * vetor1[i];
            System.out.print("\nVetor 3: " + vetor1[i] + "x" + vetor2[i] + "=" + vetor3[i]);
        }

        in.close();
    }   
}
