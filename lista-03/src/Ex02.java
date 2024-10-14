import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] vetor = new Integer[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o valor %d do vetor: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor, Collections.reverseOrder());

        System.out.printf("Vetor em ordem decrescente: ");
        for (int n : vetor) {
            System.out.printf("%d ", n);
        }

        scanner.close();
    }
}
