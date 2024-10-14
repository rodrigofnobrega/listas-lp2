import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int velocidadeMs, velocidadeConvertida = 0;

        System.out.print("Informe a velocidade em m/s: ");
        velocidadeMs = scanner.nextInt();

        velocidadeConvertida = (int)(velocidadeMs * 3.6);

        System.out.printf("A velocidade em km/h é: %dKm/h\n", velocidadeConvertida);

        scanner.close();
    }
    
}