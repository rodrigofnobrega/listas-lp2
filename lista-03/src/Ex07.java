import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Informe o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Imprimindo a matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Soma dos elementos: " + soma);

        scanner.close();
    }
}
