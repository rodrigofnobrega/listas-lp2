import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;  
        
        do {
            System.out.print("Informe sua senha: ");
            senha = scanner.nextLine();
            
            if (senha.equals("1234")) {
                System.out.println("ACESSO PERMITIDO");
            } else {
                System.err.println("ACESSO NEGADO");
            }
        } while(!senha.equals("1234"));

        scanner.close();
    }
}
