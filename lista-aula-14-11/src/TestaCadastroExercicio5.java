import java.util.ArrayList;
import java.util.List;

public class TestaCadastroExercicio5 {
    public static void main(String[] args) {
        CadastroPessoas cadastroPessoas = new CadastroPessoas();

        cadastroPessoas.cadastraPessoa(new Cliente("Rodrigo",
                new Data(11, 11, 2005), 52378));
        cadastroPessoas.cadastraPessoa(new Funcionario("Pedro",
                new Data(25, 12, 2000), 3500.0f));
        cadastroPessoas.cadastraPessoa(new Gerente("Larissa",
                new Data(23, 11, 1990), 7000.0f, "Vendas"));

        cadastroPessoas.imprimeCadastro();
    }
}

class Data {
    private final int dia;
    private final int mes;
    private final int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }
}

abstract class PessoaExercicio5 {
    private String nome;
    private Data nascimento;

    public PessoaExercicio5(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
}

class Cliente extends PessoaExercicio5 {
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente: " + getNome());
        System.out.println("Data de Nascimento: " + getNascimento());
        System.out.println("Código: " + this.codigo);
    }
}

class Funcionario extends PessoaExercicio5 {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionario: " + getNome());
        System.out.println("Data de Nascimento: " + getNascimento());
        System.out.println("Imposto: R$" + calculaImposto());
        System.out.println("Salário Bruto: R$" + this.salario);
        System.out.println("Salário Líquido: R$" + (this.salario - calculaImposto()));
    }
}

class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.05f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente: " + getNome());
        System.out.println("Data de Nascimento: " + getNascimento());
        System.out.println("Área: " + this.area);
        System.out.println("Imposto: R$" + calculaImposto());
        System.out.println("Salário Bruto: R$" + this.salario);
        System.out.println("Salário Líquido: R$" + (this.salario - calculaImposto()));
    }
}

class CadastroPessoas {
    private List<PessoaExercicio5> pessoaExercicio5s;

    public CadastroPessoas() {
        pessoaExercicio5s = new ArrayList<>();
    }

    public void cadastraPessoa(PessoaExercicio5 pessoaExercicio5) {
        this.pessoaExercicio5s.add(pessoaExercicio5);
    }

    public void imprimeCadastro() {
        for (PessoaExercicio5 pessoaExercicio5 : pessoaExercicio5s) {
            pessoaExercicio5.imprimeDados();
            System.out.println("============================================");
        }
    }
}
