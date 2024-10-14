import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeDias, idadeMod, anos, meses, dias = 0;

        System.out.print("Informe sua idade em dias: ");
        idadeDias = scanner.nextInt();
        
        idadeMod = idadeDias % 365;
        anos = idadeDias / 365;
        meses = idadeMod / 30;
        dias = idadeMod % 30;

        System.out.printf("Idade: %d anos, %d meses e %d dias%n", anos, meses, dias);

        scanner.close();
    }
}
