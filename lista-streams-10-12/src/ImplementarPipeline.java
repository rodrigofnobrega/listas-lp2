import java.util.Arrays;
import java.util.List;

public class ImplementarPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = numbers.stream()
            .filter(x -> x % 2 == 1)
            .map(x -> x*x)
            .reduce(0, (x,y) -> x + y);

        System.out.println("Soma: " + soma);
    }
}