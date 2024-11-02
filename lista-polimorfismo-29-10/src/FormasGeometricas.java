public class FormasGeometricas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(10, 3);

        System.out.printf("Área do círculo: %.2f\n", circulo.area());
        System.out.printf("Área do retângulo: %.2f\n", retangulo.area());
    }
}

abstract class Forma {
    public abstract double area();
}

class Circulo extends Forma {
    private double raio;

    @Override
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    @Override
    public double area() {
        return largura * altura;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
}