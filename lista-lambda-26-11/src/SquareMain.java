public class SquareMain {
    public static void main(String[] args) {
        Square square = (num) -> Math.pow(num, 2);

        System.out.printf("%.1f² = %.1f\n", 2.0, square.calculate(2));
        System.out.printf("%.1f² = %.1f\n", 5.0, square.calculate(5));
        System.out.printf("%.1f² = %.1f\n", 15.0, square.calculate(15));
    }
}

@FunctionalInterface
interface Square {
    double calculate(double num);
}