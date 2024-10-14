public class Ex03 {
    public static void main(String[] args) {
        double raio = 2.8;
        double pi = Math.PI;
        double area, perimetro = 0;

        area = pi * Math.pow(raio, 2);
        perimetro = 2 * pi * raio;

        System.out.printf("Área da circunferência: %.2f\n", area);
        System.out.printf("Perímetro da circunferência: %.2f\n", perimetro);
    }
}
