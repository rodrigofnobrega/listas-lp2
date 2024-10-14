import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Informe o tamanho do vetor: ");
        n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o valor %d do vetor: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.printf("\nSequência invertida: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println();

        scanner.close();
    }
}