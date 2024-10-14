import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b = 0;

        System.out.print("Digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = scanner.nextInt();
        
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        
        scanner.close();    
    }
    
}