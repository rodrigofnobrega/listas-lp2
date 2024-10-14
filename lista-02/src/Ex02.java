import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (Character.isLetter(caractere)) {
            caractere = Character.toLowerCase(caractere);

            switch (caractere) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("O caractere é uma vogal");
                    break;
                default:
                    System.out.println("O caractere é uma consoante");
                    break;
            }
        } else if (Character.isDigit(caractere)) {
            System.out.println("O caractere é um número.");
        } 

        scanner.close();
    }
}
