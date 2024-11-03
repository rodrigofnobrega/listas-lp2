import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();

        trianguloRetangulo.setCatetoBase(scanner);
        trianguloRetangulo.setCatetoAltura(scanner);

        System.out.println("Dimensões do triângulo retângulo");
        System.out.println("Cateto base: " + trianguloRetangulo.getCatetoBase() + "cm");
        System.out.println("Altura cateto: " + trianguloRetangulo.getCatetoAltura() + "cm");

        scanner.close();
    }
}

class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;

    public double getCatetoBase() {
        return this.catetoBase;
    }

    public void setCatetoBase(Scanner scanner) {
        System.out.print("Informe o cateto base do triângulo retângulo: ");
        this.catetoBase = scanner.nextDouble();
    }

    public double getCatetoAltura() {
        return this.catetoAltura;
    }

    public void setCatetoAltura(Scanner scanner) {
        System.out.print("Informe a altura do cateto do triângulo retângulo: ");
        this.catetoAltura = scanner.nextDouble();
    }
}