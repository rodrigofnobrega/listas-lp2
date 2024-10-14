public class Ex01 {
    public static void main(String[] args) {
        double base = 7.5;
        double altura = 12.3;
        double area, perimetro = 0;

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
