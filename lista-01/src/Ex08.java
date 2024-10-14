public class Ex08 {
    public static void main(String[] args) {
        double raio = 2.6;
        double altura = 22.1;
        double volume = 0;

        volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2fcm³\n", volume);
    }
}