import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro positivo n: ");
        n = scanner.nextInt();

        for (int linha = 0; linha < n; linha++) {
            int coeficiente = 1; 
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.printf("%2d ", coeficiente);
                coeficiente = coeficiente * (linha - coluna) / (coluna + 1); 
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
