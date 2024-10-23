import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();

        trianguloRetangulo.setCatetoBase(scanner);
        trianguloRetangulo.setCatetoAltura(scanner);
        trianguloRetangulo.hipotenusa();

        System.out.println("Dimensões do triângulo retângulo");
        System.out.println("Cateto base: " + trianguloRetangulo.getCatetoBase() + "cm");
        System.out.println("Altura cateto: " + trianguloRetangulo.getCatetoAltura() + "cm");
        System.out.println("Hipotenusa: " + trianguloRetangulo.getHipotenusa() + "cm");
        System.out.println("Perímetro: " + trianguloRetangulo.perimetro() + "cm");
        System.out.println("Área: " + trianguloRetangulo.area() + "cm²");

        scanner.close();
    }
}

class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public double area() {
        return (this.catetoBase * this.catetoAltura) / 2;
    }

    public double perimetro() {
        return this.catetoBase + this.catetoAltura + this.hipotenusa;
    }

    public void hipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(catetoBase, 2) + Math.pow(catetoAltura, 2));
    }

    public double getHipotenusa() {
        return this.hipotenusa;
    }

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
