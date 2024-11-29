import java.util.*;

public class Main {
    public static Integer buscaBinaria(List<Integer> lista, int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }
        
        int indiceMeio = (inicio + fim) / 2;
        int valorMeio = lista.get(indiceMeio);

        if (valorMeio == valor) {
            return indiceMeio;
        }

        if (valor < valorMeio) {
            return buscaBinaria(lista, valor, inicio, indiceMeio - 1);
        }

        return buscaBinaria(lista, valor, indiceMeio + 1, fim);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int valor;

        System.out.println("Informe os valores para adicionar na lista");
        System.out.println("Digite -1 para finalizar a adição");

        while (true) {
            System.out.print("Informe o número para adicionar: ");
            valor = scanner.nextInt();
            if (valor == -1) break;
            lista.add(valor);
        }

        Collections.sort(lista);
        System.out.print("Lista ordenada: ");
        lista.forEach(v -> System.out.print(v + " "));
        System.out.println();

        while (true) {
            System.out.print("Informe o valor a buscar: ");
            valor = scanner.nextInt();

            if (valor == -1) {
                break;
            }

            int posValor = buscaBinaria(lista, valor, 0, lista.size() - 1);

            if (posValor == -1) {
                System.out.println("Valor não encontrado.");
            } else {
                System.out.println("O valor encontrado está na posição: " + posValor);
            }
        }
    }
}
