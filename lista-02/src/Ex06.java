import java.util.Scanner;

public class Ex06 {
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }

        for(int i = num-1; i >= 1; i--) {
            num *= i;
        }

        return num;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTermos = 0;
        double euler = 1.0;

        System.out.print("Informe o número de termos: ");
        numTermos = scanner.nextInt();

        for(int i = 1; i <= numTermos; i++) {
            euler += 1.0 / fatorial(i);
        }

        System.out.println("O valor do número de euler é: " + euler);

        scanner.close();
    }
}
