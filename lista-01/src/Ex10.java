import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaSemestral = 0;
        int i = 0;
        
        do {
            System.out.printf("Informa a nota da prova %d: ", ++i);
            mediaSemestral += scanner.nextDouble();
        } while(i < 4);

        mediaSemestral /= 4;

        System.out.printf("Sua média semestral foi: %.2f\n", mediaSemestral);

        scanner.close();
    }
}