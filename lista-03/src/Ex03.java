import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int[] posMaior = new int[2]; // pos 0 = i; pos 1 = j;
        int[][] matriz = new int[5][5];

        for(int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                System.out.printf("Informe o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posMaior[0] = i;
                    posMaior[1] = j;
                }
            }
        }

        System.out.println("Exibindo matriz: ");
        for(int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.printf("O maior número foi %d e sua posição [%d, %d]", maior, posMaior[0]+1, posMaior[1]+1);

        scanner.close();
    }


}
