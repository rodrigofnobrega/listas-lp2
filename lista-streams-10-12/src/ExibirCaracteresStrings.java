import java.util.stream.Collectors;

public class ExibirCaracteresStrings {
    public static void main(String[] args) {
        String frase = "programacao em java";

        String fraseOrdenada = frase.chars()
                .boxed()
                .collect(Collectors.groupingBy(c -> (char) c.intValue(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Frase ordenada: " + fraseOrdenada);
    }
}
