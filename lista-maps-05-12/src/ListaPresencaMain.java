import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaPresencaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> alunos = new HashMap<>();
        Map<Integer, String> frequencia = new HashMap<>();
        int idAluno;

        alunos.put(101, "Maria");
        alunos.put(102, "Pedro");
        alunos.put(103, "Paulo");
        alunos.put(104, "José");
        alunos.put(105, "Larissa");
        alunos.put(106, "Marilia");

        for (Integer id : alunos.keySet()) {
            frequencia.put(id, "Ausente");
        }

        for (Map.Entry<Integer, String> entry : alunos.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - Nome: " + entry.getValue());
        }

        do {
            System.out.print("Digite o ID do aluno para marcar a presença (0 para parar): ");
            idAluno = sc.nextInt();

            if (alunos.containsKey(idAluno)) {
                System.out.println("Presença adicionada para o aluno: " + alunos.get(idAluno));
                frequencia.put(idAluno, "Presente");
            } else {
                System.out.println("Id de aluno inválido");
            }

        } while(idAluno != 0);

        for (Map.Entry<Integer, String> entry : frequencia.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - Nome: " + alunos.get(entry.getKey())
                    + " - Presente: " + entry.getValue());
        }

        sc.close();
    }
}
