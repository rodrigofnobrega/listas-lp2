import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(scanner);
        retangulo.setLargura(scanner);

        System.out.println("Dimensões do retângulo");
        System.out.println("Altura: " + retangulo.getAltura() + "cm");
        System.out.println("Largura: " + retangulo.getLargura() + "cm");
        System.out.println("Perímetro: " + retangulo.perimetro() + "cm");
        System.out.println("Área: " + retangulo.area() + "cm²");

        scanner.close();
    }
}

class Retangulo {
    private double altura;
    private double largura;

    public double area() {
        return this.altura * this.largura;
    }

    public double perimetro() {
        return 2 * (this.largura + this.altura);
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(Scanner scanner) {
        System.out.print("Informe a altura do retângulo: ");
        this.altura = scanner.nextDouble();
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(Scanner scanner) {
        System.out.print("Informe a largura do retângulo: ");
        this.largura = scanner.nextDouble();
    }
}