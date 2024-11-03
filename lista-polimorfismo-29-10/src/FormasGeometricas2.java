public class FormasGeometricas2 {
    public static void main(String[] args) {
        Circulo2 circulo = new Circulo2("Amarelo", true, 5);
        Retangulo2 retangulo = new Retangulo2("Preto", false, 10, 3);
        Quadrado2 quadrado = new Quadrado2("Azul", true, 2);

        System.out.println(circulo);
        System.out.println(retangulo);
        System.out.println(quadrado);
    }
}

abstract class Forma2 {
    private String cor;
    private boolean filled;

    public abstract double area();

    public abstract double perimetro();

    public Forma2(String cor, boolean filled) {
        this.cor = cor;
        this.filled = filled;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Forma2{" +
                "cor='" + cor + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circulo2 extends Forma2 {
    private double raio;

    @Override
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public Circulo2(String cor, boolean filled, double raio) {
        super(cor, filled);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "cor='" + getCor() + '\'' +
                ", filled=" + getFilled() +
                ", área='" + area() + '\'' +
                ", perímetro=" + perimetro() +
                '}';
    }
}

class Retangulo2 extends Forma2 {
    private double largura;
    private double altura;

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public double perimetro() {
        return (2 * largura) + (2 * altura);
    }

    public Retangulo2(String cor, boolean filled, double largura, double altura) {
        super(cor, filled);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "cor='" + getCor() + '\'' +
                ", filled=" + getFilled() +
                ", área='" + area() + '\'' +
                ", perímetro=" + perimetro() +
                '}';
    }
}

class Quadrado2 extends Forma2 {
    private double lado;

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double perimetro() {
        return Math.pow(lado, 4);
    }

    public Quadrado2(String cor, boolean filled, double lado) {
        super(cor, filled);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "cor='" + getCor() + '\'' +
                ", filled=" + getFilled() +
                ", área='" + area() + '\'' +
                ", perímetro=" + perimetro() +
                '}';
    }
}