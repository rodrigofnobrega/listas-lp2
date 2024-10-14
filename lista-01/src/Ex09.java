import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("Informe um número inteiro menos que 32: ");
            num = scanner.nextInt();

            if (num >= 32) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while(num >= 32 || num < 0);

        System.out.print("Número em binário: " );

        while (num > 0) {
            System.out.print(num % 2);
            num /= 2;
        }

        scanner.close();
    }
}
