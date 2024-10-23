import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(scanner);
        retangulo.setLargura(scanner);

        System.out.println("Dimensões do retângulo");
        System.out.println("Altura: " + retangulo.getAltura() + "cm");
        System.out.println("Largura: " + retangulo.getLargura() + "cm");

        scanner.close();
    }
}

class Retangulo {
    private double altura;
    private double largura;

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(Scanner scanner) {
        System.out.print("Informe a altura do retângulo: ");
        this.altura = scanner.nextDouble();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(Scanner scanner) {
        System.out.print("Informe a largura do retângulo: ");
        this.largura = scanner.nextDouble();
    }
}