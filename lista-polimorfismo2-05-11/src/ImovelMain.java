public class ImovelMain
{
	public static void main(String[] args) {
		Novo novo = new Novo(1000.0, "Av ayrton senna");
		Velho velho = new Velho(1000.0, "Abel cabral");
		
		novo.mostrarInformacoes();
		velho.mostrarInformacoes();
	}
}

class Imovel {
	private double preco;
	private String endereco;

	public Imovel(double preco, String endereco) {
		this.preco = preco;
		this.endereco = endereco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}
}

class Novo extends Imovel {
	private double valorAdicional = 1.1;

	public Novo(double preco, String endereco) {
		super(preco, endereco);
	    preco *= this.valorAdicional;
	    setPreco(preco);
	}

	public double getValorAdicional() {
		return this.valorAdicional;
	}

	public void mostrarInformacoes() {
	    System.out.println("Imovel novo");
        System.out.println("Preço: " + getPreco());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Adicional: " + getValorAdicional());
	}
}

class Velho extends Imovel {
	private double desconto = 0.9;

	public Velho(double preco, String endereco) {
		super(preco, endereco);
	    preco *= this.desconto;
		setPreco(preco);
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void mostrarInformacoes() {
	    System.out.println("Imovel velho");
        System.out.println("Preço: " + getPreco());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Desconto: " + getDesconto());
	}
}

