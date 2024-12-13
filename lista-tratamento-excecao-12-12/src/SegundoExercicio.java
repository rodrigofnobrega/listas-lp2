import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        int numero = 0;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                numeros[contador++] = numero;
            } catch (InputMismatchException err) {
                System.out.println("Valor inválido. Insira um número inteiro");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException err) {
                System.out.println("Todos os valores já foram preenchidos");
                Arrays.stream(numeros).forEach(i -> System.out.print(i + " "));
                break;
            }
        }
    }
}
