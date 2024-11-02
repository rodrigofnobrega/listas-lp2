public class VeiculosHeranca {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Chevrolet", "Camaro");
        Moto moto = new Moto("Honda", "CB500");

        carro.acelerar();
        carro.exibirInformacoes();

        moto.acelerar();
        moto.exibirInformacoes();
    }
}

abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.setMarca(marca);
        this.setModelo(modelo);
    }

    public abstract void exibirInformacoes();

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Carro extends Veiculo {
    private String tipo = "Carro";

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tipo: " + this.getTipo());
    }

    public String getTipo() {
        return this.tipo;
    }
}

class Moto extends Veiculo {
    private String tipo = "Moto";

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tipo: " + this.getTipo());
    }

    public String getTipo() {
        return this.tipo;
    }
}
