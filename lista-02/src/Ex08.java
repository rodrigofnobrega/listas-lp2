import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        do {
            System.out.print("Informe um número: ");
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Número inválido. O número deve ser maior que zero.");
            } 
            if (num % 2 != 0) {
                System.out.println("Número inválido. O número deve ser par.");
            }

        } while (num <= 0 || num % 2 != 0);


        System.out.print("Divisores: ");

        while (i <= num) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
            i++;
        }

        System.out.println();

        scanner.close();
    }
}
