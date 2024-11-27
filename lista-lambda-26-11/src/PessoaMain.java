import java.util.ArrayList;
import java.util.List;

public class PessoaMain {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Edimilson", 60, 6000.0));
        pessoas.add(new Pessoa("Fernanda", 18, 2100.0));
        pessoas.add(new Pessoa("Alírio", 35, 3200.0));

        Desconto desconto = (pessoa) -> {
            if (pessoa.getSalario() < 3000) {
                return pessoa.getSalario() * 0.9;
            }
            return pessoa.getSalario() * 0.75;
        };

        List<Pessoa> filtrarIdade = pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() > 30)
                .toList();
        filtrarIdade.forEach(pessoa -> {
            System.out.println("Pessoa com idade maior que 30 anos: " + pessoa.getNome());
        });
        System.out.println();

        System.out.println("Pessoa ordenadas pelo nome:");
        List<Pessoa> ordenadaPorNome = pessoas.stream()
                .sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
                .toList();
        ordenadaPorNome.forEach(pessoa -> {
            System.out.println(pessoa.getNome());
        });
        System.out.println();


        pessoas.forEach(pessoa -> {
            System.out.println("Pessoa: " + pessoa.getNome());
            System.out.println("Salário antigo: " + pessoa.getSalario());
            pessoa.setSalario(desconto.descontar(pessoa));
            System.out.println("Salário descontado: " + pessoa.getSalario());
            System.out.println();
        });
    }
}

@FunctionalInterface
interface Desconto {
    double descontar(Pessoa pessoa);
}

class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}