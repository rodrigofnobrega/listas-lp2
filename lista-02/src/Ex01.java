import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média parcial foi: %.2f\n", media);

        if (media >= 6.0 && nota1 >= 4 && nota2 >= 4 && nota3 >= 4) {
            System.out.println("Aluno aprovado!");
        } else if (media < 3.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno poderá fazer a prova de reposição.");
        }

        scanner.close();
    }
}
