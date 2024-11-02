import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaCorrente());
        contas.add(new ContaPoupanca());

        for (Conta c : contas) {
            System.out.printf("Juros: %.2f\n", c.calcularJuros(1000, 10, 30));
        }
    }
}

abstract class Conta {
    public abstract double calcularJuros(double capitalInicial, double taxa, int tempo);
}

class ContaCorrente extends Conta {

    @Override
    public double calcularJuros(double capitalInicial, double taxa, int tempo) {
        return capitalInicial * Math.pow((1 + (taxa/100)), taxa);
    }
}

class ContaPoupanca extends Conta{

    @Override
    public double calcularJuros(double capitalInicial, double taxa, int tempo) {
        return capitalInicial * Math.pow((1 + (taxa/100)), taxa);
    }
}