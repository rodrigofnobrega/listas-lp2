import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit, celsius = 0;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextInt();
        celsius = ( 5 * (fahrenheit-32)) / 9;

        System.out.printf("Temperatura em Celsius é: %d°C\n", celsius);
        
        scanner.close();
    }
}
