import java.util.Arrays;
import java.util.List;

public class AgruparNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110);

        List<Integer> pares = numeros.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        List<Integer> impares = numeros.stream()
                .filter(x -> x % 2 == 1)
                .toList();

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
