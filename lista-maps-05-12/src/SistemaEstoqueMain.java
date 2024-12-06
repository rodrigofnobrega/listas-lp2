import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaEstoqueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Produto> estoque = new HashMap<>();
        String nome;
        String continuar = "s";
        int id, quantidade;

        System.out.println("===========================");
        System.out.println("   Cadastrando Produtos");
        System.out.println("===========================");

        do {
            System.out.print("Informe o nome do produto: ");
            nome = scanner.nextLine();
            System.out.print("Informe o ID do produto: ");
            id = scanner.nextInt();
            if (estoque.containsKey(id)) {
                System.out.println("Valor de ID inválido. Tente novamente");
                scanner.nextLine();
                continue;
            }
            System.out.print("Informe a quantidade do produto: ");
            quantidade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Deseja adicionar outro produto [s/n]? ");
            continuar = scanner.nextLine();
            System.out.println();

            estoque.put(id, new Produto(nome, quantidade));


        } while(continuar.equalsIgnoreCase("s"));

        for (Map.Entry<Integer, Produto> produto : estoque.entrySet()) {
            if (produto.getValue().getQuantidade() >= 30) {
                continue;
            }

            System.out.println("ID: " + produto.getKey() + " - Produto: " + produto.getValue().getNome()
                    + " - Quantidade: " + produto.getValue().getQuantidade());
        }

        scanner.close();
    }
}

class Produto {
    private String nome;
    private Integer quantidade;

    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}