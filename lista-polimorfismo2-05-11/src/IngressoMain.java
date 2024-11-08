public class IngressoMain {
    public static void main (String[] args) {
        Vip vip = new Vip(100.0);
        Normal normal = new Normal(100.0);
        CamaroteInferior camaroteInferior = new CamaroteInferior(100.0);
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0);
        
        vip.valorIngresso();
        normal.tipoIngresso();
        camaroteInferior.imprimirLocalizacao();
        camaroteSuperior.imprimirLocalizacao();
        camaroteSuperior.valorIngresso();
    }
}

class Ingresso {
    private double preco;
    
    public Ingresso(double preco) {
        this.preco = preco;
    }
    
    public void imprimeValor() {
        System.out.println("Valor do ingresso é: " + getPreco());
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

class Vip extends Ingresso {
    private double valorAdicional = 1.1;
    
    public Vip(double preco) {
        super(preco);
    }
    
    public void valorIngresso() {
        System.out.println("Valor do ingresso é: " + getPreco() * valorAdicional);
    }
}

class Normal extends Ingresso {
    public Normal(double preco) {
        super(preco);
    }
    
    public void tipoIngresso() {
        System.out.println("Ingresso Normal");
    }
}

class CamaroteInferior extends Vip {
    private String localizacao = "Camarote Inferior";
    
    public CamaroteInferior(double preco) {
        super(preco);
    }
    
    public void imprimirLocalizacao() {
        System.out.println("localizacao: " + getLocalizacao());
    }
    
    public String getLocalizacao() {
        return this.localizacao;
    }
}

class CamaroteSuperior extends Vip {
    private String localizacao = "Camarote Superior";
    
    public CamaroteSuperior(double preco) {
        super(preco);
    }
    
    public void imprimirLocalizacao() {
        System.out.println("localizacao: " + getLocalizacao());
    }
    
    public String getLocalizacao() {
        return this.localizacao;
    }
}
