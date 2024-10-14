import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resistencia1, resistencia2, resistencia3, resistenciaTotal = 0;

        System.out.print("Digite o valor da resistência R1: ");
        resistencia1= scanner.nextDouble();

        System.out.print("Digite o valor da resistência R2: ");
        resistencia2 = scanner.nextDouble();

        System.out.print("Digite o valor da resistência R3: ");
        resistencia3 = scanner.nextDouble();

        resistenciaTotal = ((resistencia1 * resistencia2) / (resistencia1 + resistencia2)) + resistencia3;

        System.out.printf("A resistência equivalente do circuito é: %.2f Ohms\n", resistenciaTotal);

        scanner.close();
    }
}
