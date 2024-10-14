import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gastoGasolinaAutomovel = 12;
        double tempo, velocidadeMedia, distancia, combustivelGasto = 0;        

        System.out.print("Tempo gasto na viagem: ");
        tempo = scanner.nextDouble();

        System.out.print("Velocidade média: ");
        velocidadeMedia = scanner.nextDouble();

        distancia = tempo * velocidadeMedia;
        combustivelGasto = distancia / gastoGasolinaAutomovel;

        System.out.printf("O consumo de gasolina na viagem foi: %.2fL\n", combustivelGasto);

        scanner.close();
    }
}