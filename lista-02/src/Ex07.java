import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.print("Informe um número: ");
        num = scanner.nextInt();
        
        System.out.printf("O fatorial do número %d é: ", num);
        if (num == 0) {
            System.out.println("1");
        } else {
            for(int i = num-1; i >= 1; i--) {
                num *= i;
            }
    
            System.out.println(num);

        }

        scanner.close();
    }
}
