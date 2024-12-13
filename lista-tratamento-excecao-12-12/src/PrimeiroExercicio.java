import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        int soma = 0;

        while (true) {
            System.out.print("Informe um número: ");
            try {
                numero = scanner.nextInt();

                soma += numero;
                contador++;

                if (soma > 100) {
                    throw new ExcecaoAcimaDeCem();
                }
            } catch (InputMismatchException err) {
                System.out.println("Valor inválido. Insira um número inteiro");
                scanner.nextLine();
            } catch (ExcecaoAcimaDeCem err) {
                System.out.println("Soma: " + soma);
                System.out.printf("Média: %.2f\n", (double)soma / (double)contador);
                System.out.println("Contador: " + contador);
                break;
            }
        }
    }
}

class ExcecaoAcimaDeCem extends RuntimeException { }