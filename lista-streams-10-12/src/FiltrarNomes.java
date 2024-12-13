import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Francisco", "Chagas", "Eduardo",
                "Fábio", "Baltazar", "Gaspar", "Fred", "Bela");

        List<String> nomesFiltrados = nomes.stream()
                .filter(x -> x.length() > 5)
                .toList();

        System.out.println(nomesFiltrados);
    }
}
