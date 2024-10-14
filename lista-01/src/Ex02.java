public class Ex02 {
    public static void main(String[] args) {
        double lado = 8.0;
        double area, perimetro = 0;

        area = Math.pow(lado, 2);
        perimetro = 4 * lado;

        System.out.println("Área do quadrado: " + area);
        System.out.println("Perímetro do quadrado: " + perimetro);
    }
}
