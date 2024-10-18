public class AluguelMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Jaguar", "F-type");
        Carro carro2 = new Carro("Tesla", "Cybertruck");

        Cliente cliente1 = new Cliente("Pedro");
        Cliente cliente2 = new Cliente("Vitor");

        Aluguel aluguel1 = new Aluguel();
        Aluguel aluguel2 = new Aluguel();
        Aluguel aluguel3 = new Aluguel();
        
        aluguel1.alugar(cliente1, carro1, 10);
        aluguel2.alugar(cliente2, carro1, 15);
        aluguel3.alugar(cliente1, carro2, 20);

        System.out.println();

        aluguel1.devolver(cliente1, carro2);
        aluguel2.devolver(cliente1, carro1);
        aluguel3.devolver(cliente1, carro2);

        System.out.println();

        aluguel3.alugar(cliente2, carro2, 25);
    }
}

class Aluguel {
    private Cliente cliente;
    private Carro carro;
    private int tempoAluguel;

    public boolean alugar(Cliente cliente, Carro carro, int tempoAluguel) {
        this.cliente = cliente;
        this.carro = carro;
        this.tempoAluguel = tempoAluguel;

        if (carro.isDisponivel()) {
            System.out.printf("Foi realizado o aluguel do carro %s para %s\n", carro.getModelo(), cliente.getNome());
            carro.setDisponivel(false);
            return true;
        } 
    
        System.out.printf("O carro %s já está alugado\n", carro.getModelo());
        
        return false;
    }

    public boolean devolver(Cliente cliente, Carro carro) {
        if (carro.isDisponivel()) {
            System.out.println("Devolução inválida. O carro não estava alugado");
            return false;
        }

        if (!this.cliente.equals(cliente)) {
            System.out.println("Cliente não corresponde ao que fez o alugel");
            return false;
        }
        
        if (!this.carro.equals(carro)) {
            System.out.println("Carro não corresponde ao que foi alugado");
            return false; 
        }

        carro.setDisponivel(true);
        System.out.printf("O carro %s foi devolvido com sucesso\n", carro.getModelo());
        return true;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public int getTempoAluguel() {
        return this.tempoAluguel;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private boolean disponivel;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.disponivel = true;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
