import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[3][2];
        int[][] matrizC = new int[2][2];
        
        System.out.println("Preencha a matriz A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Informe o valor da posição [%d][%d]: ", i, j);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha a matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Informe o valor da posição [%d][%d]: ", i, j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                matrizC[i][j] = 0;
                for (int k = 0; k < 3; k++) { 
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Exibindo a matriz C");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%2d ", matrizC[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
