import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = 0;
        int coluna = 0;
        char[][] tabuleiro = new char[8][8];

        System.out.print("Digite a linha em que a torre se encontra: ");
        linha = scanner.nextInt();
        System.out.print("Digite a coluna em que a torre se encontra: ");
        coluna = scanner.nextInt();

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j+1 != coluna && i+1 != linha) {
                    tabuleiro[i][j] = '-';
                } else {
                    tabuleiro[i][j] = 'X';
                }
            }
        }

        System.out.println("Movimentos possíveis: ");

        System.out.println("    1  2  3  4  5  6  7  8");
        System.out.println("   ------------------------");
        for(int i = 0; i < 8; i++) {
            System.out.printf("%d |", i+1);
            for (int j = 0; j < 8; j++) {
                System.out.printf("%2c ", tabuleiro[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
