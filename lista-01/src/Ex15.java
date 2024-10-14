import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double comprimento, largura, altura, volume = 0;

        do {
            System.out.print("Informe o comprimento da caixa: ");
            comprimento = scanner.nextDouble();
            if (comprimento <= 0) {
                System.out.println("Comprimento inválido. Tente novamente.");
            }
        } while (comprimento <= 0);

        do {
            System.out.print("Informe a largura da caixa: ");
            largura = scanner.nextDouble();
            if (largura <= 0) {
                System.out.println("Largura inválida. Tente novamente.");
            }
        } while (largura <= 0);

        do {
            System.out.print("Informe a altura da caixa: ");
            altura = scanner.nextDouble();
            if (altura <= 0) {
                System.out.println("Altura inválida. Tente novamente.");
            }
        } while (altura <= 0);


        volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa é: %.2f\n", volume);

        scanner.close();
    }    
}