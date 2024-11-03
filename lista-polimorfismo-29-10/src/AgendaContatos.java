import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AgendaContatos {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Contato> agenda = new ArrayList<>();
    private static String nome;
    private static String endereco;
    private static String email;
    private static int opcao;

    public static void main(String[] args) {
        do {
            menu();

            if (opcao == 1) {
                escolherTipoContato();
                if (opcao == 1) {
                    adicionarPessoaFisica();
                } else {
                    adicionarPessoaJuridica();
                }
                ordenar();
            } else if (opcao == 2) {
                removerContato();
            } else if (opcao == 3) {
                escolherTipoPesquisa();

                if (opcao == 1) {
                    pesquisarContatoNome();
                } else {
                    pesquisarPorCpfOuCnpj();
                }
            } else if (opcao == 4) {
                listarTodosContatos();
            } else if (opcao > 4){
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        System.out.println("Finalizando programa.");
    }

    public static void menu() {
        System.out.println("==============================");
        System.out.println("       Escolha uma opção      ");
        System.out.println("==============================");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Pesquisar");
        System.out.println("4 - Visualizar todos os contatos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
    }

    public static void escolherTipoContato() {
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
    }

    public static void adicionarContatoBasico() {
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
    }

    public static void adicionarPessoaFisica() {
        adicionarContatoBasico();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.println("Data Nascimento");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        scanner.nextLine();

        String dataNascimentoString = Util.buildStringData(dia, mes, ano);
        LocalDate dataNascimento = Util.formatarData(dataNascimentoString);

        agenda.add(new PessoaFisica(nome, endereco, email, cpf, estadoCivil, dataNascimento));

        System.out.println("Contato adicionado com sucesso");
    }

    public static void adicionarPessoaJuridica() {
        adicionarContatoBasico();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscricaoEstadual = scanner.nextLine();
        System.out.print("Razão Social: ");
        String razaoSocial = scanner.nextLine();

        agenda.add(new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual, razaoSocial));

        System.out.println("Contato adicionado com sucesso");
    }

    public static void listarTodosContatos() {
        agenda.forEach(c -> {
            System.out.println(c.toString());
        });
    }

    public static void removerContato() {
        System.out.print("Informe o email do contato: ");
        String email = scanner.nextLine();

        Iterator<Contato> iterator = agenda.iterator();


        while (iterator.hasNext()) {
            Contato c = iterator.next();
            if (c.getEmail().equalsIgnoreCase(email)) {
                iterator.remove();
                System.out.println("Contato removido com sucesso");
                return;
            }
        }

        System.out.println("Contato não foi encontrado");
    }

    public static void escolherTipoPesquisa() {
        System.out.println("1 - Pesquisar por Nome");
        System.out.println("2 - Pesquisar por CPF ou CNPJ");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
    }

    public static void pesquisarContatoNome() {
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        agenda.forEach(c -> {
            if (c.getNome().equalsIgnoreCase(nome)) {
                System.out.println(c);
            }
        });
    }

    public static void pesquisarPorCpfOuCnpj() {
        System.out.print("Informe o CPF ou CNPJ: ");
        String identificador = scanner.nextLine();

        agenda.forEach(c -> {
            if (c instanceof PessoaFisica) {
                if ( ((PessoaFisica) c).getCpf().equalsIgnoreCase(identificador) ) {
                    System.out.println(c);
                    return;
                }
            } else if (c instanceof PessoaJuridica) {
                if ( ((PessoaJuridica) c).getCnpj().equalsIgnoreCase(identificador)) {
                    System.out.println(c);
                    return;
                }
            }
        });
    }

    public static void ordenar() {
        ordenarContatosPeloTipo();
        ordenarCrescentePeloCpfouCnpj();
    }

    public static void ordenarContatosPeloTipo() {
        for (int i = 0; i < agenda.size() - 1; i++) {
            for (int j = 0; j < agenda.size() - 1 - i; j++) {
                Contato atual = agenda.get(j);
                Contato proximo = agenda.get(j + 1);

                if (atual instanceof PessoaJuridica && proximo instanceof PessoaFisica) {
                    // Troca as posições
                    agenda.set(j, proximo);
                    agenda.set(j + 1, atual);
                }
            }
        }
    }

    public static void ordenarCrescentePeloCpfouCnpj() {
        List<Contato> pessoasFisicas = new ArrayList<>();
        List<Contato> pessoaJuridicas = new ArrayList<>();

        for (Contato c : agenda) {
            if (c instanceof PessoaFisica) {
                pessoasFisicas.add(c);
            } else if (c instanceof PessoaJuridica) {
                pessoaJuridicas.add(c);
            }
        }

        pessoasFisicas.sort(Comparator.comparing(p -> ((PessoaFisica) p).getCpf()));

        pessoaJuridicas.sort(Comparator.comparing(p -> ((PessoaJuridica) p).getCnpj()));

        agenda.clear();
        agenda.addAll(pessoasFisicas);
        agenda.addAll(pessoaJuridicas);
    }
}

abstract class Contato {
    private String nome;
    private String endereco;
    private String email;

    public Contato(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

class PessoaFisica extends Contato {
    private String cpf;
    private String estadoCivil;
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String estadoCivil,
                        LocalDate dataNascimento) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", email='" + getEmail() + '\'' +
                "cpf='" + cpf + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}

class PessoaJuridica extends Contato {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, String inscricaoEstadual,
                          String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", email='" + getEmail() + '\'' +
                "cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}

class Util {
    public static LocalDate formatarData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return LocalDate.parse(data, formatter);
    }

    public static String buildStringData(int dia, int mes, int ano) {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
}