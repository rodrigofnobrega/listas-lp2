import java.util.Scanner;

public class Banco {
    public static String menu() {
        return String.format("1 - Criar conta\n" +
                      "2 - Sacar\n" + 
                      "3 - Depositar\n" +
                      "4 - Saldo\n" + 
                      "0 - Sair");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaBancaria();
        
        do {
            System.out.println(menu());
            System.out.print("Informe uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao == 1) {
                System.out.print("Informe seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Informe seu CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Informe sua profissão: ");
                String profissao = scanner.nextLine();
                System.out.print("Informe sua senha: ");
                String senha = scanner.nextLine();
                System.out.print("Informe sua idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                
                cliente = new Cliente(nome, cpf, profissao, idade);
                conta = new ContaBancaria("1234-5", "1111-5", senha, cliente);
                System.out.println("Sua conta foi criada");
            } else if (opcao == 2) {
                System.out.print("Informe a sua senha: ");
                String senha = scanner.nextLine();
                System.out.print("Informe o valor do saque: ");
                int valor = scanner.nextInt();
                scanner.nextLine();
                
                if(conta.sacar(senha, valor)) {
                    System.out.println("Seu saque foi realizado com sucesso");
                }
            } else if (opcao == 3) {
                System.out.print("Informe a sua senha: ");
                String senha = scanner.nextLine();
                System.out.print("Informe o valor do saque: ");
                int valor = scanner.nextInt();
                scanner.nextLine();
                
                if (conta.depositar(senha, valor)) {
                    System.out.println("Seu depósito foi realizado com sucesso");
                }
            } else if (opcao == 4) {
                System.out.print("Seu saldo é: ");
                System.out.println(conta.getSaldo());
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
            
            
        } while(opcao != 0);
        
        scanner.close();
    }
}

class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private String senha;
    private double saldo;
    private Cliente titular;
    
    public ContaBancaria() {
        
    }

    public ContaBancaria(String numeroConta, String agencia, String senha, Cliente titular) {
        this.setNumeroConta(numeroConta);
        this.setAgencia(agencia);
        this.setSenha(senha);
        this.setSaldo(0);
        this.setTitular(titular);
    }
    
    public boolean sacar(String senha, double valor) {
        if (!senhaValida(senha)) {
            System.out.println("Senha inválida");
            return false;
        } 
        
        if (this.saldo < 0) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        
        this.saldo -= valor;
        
        return true;
    }
    
    public boolean depositar(String senha, double valor) {
        if (!senhaValida(senha)) {
            System.out.println("Senha inválida");
            return false;
        } 
        
        if (valor < 0) {
            System.out.println("Valor inválido");
            return false;
        }
        
        this.saldo += valor;
        
        return true;
    }
    
    private boolean senhaValida(String senha) {
        return this.senha.equals(senha);
    } 
    

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    private void setTitular(Cliente titular) {
        this.titular = titular;
    }
}


class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private int idade;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String cpf, String profissao, int idade) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setProfissao(profissao);
        this.setIdade(idade);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
     
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}