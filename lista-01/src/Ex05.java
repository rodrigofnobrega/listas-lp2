import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, quociente, resto = 0;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        quociente = num1 / num2;
        resto = num1 % num2;

        System.out.printf("Quociente: %d\n", quociente);
        System.out.printf("Resto: %d\n", resto);

        scanner.close();
    }
}
