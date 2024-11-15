import java.util.List;
import java.util.ArrayList;

public class ProgramaExercicio4 {
    public static void main(String[] args) {
        Vector pessoas = new Vector();

        pessoas.add(new Homem(72, 1.76));
        pessoas.add(new Mulher(58, 1.55));

        for (int i = 0; i < 2; i++) {
            PessoaIMC pessoa = (PessoaIMC) pessoas.elementAt(i);
            if (pessoa instanceof Homem) {
                System.out.println("Homem");
            } else {
                System.out.println("Mulher");
            }
            System.out.println(pessoa.toString());
            System.out.printf("IMC: %.2f\n", pessoa.calculaIMC(pessoa.getPeso(), pessoa.getAltura()));
            System.out.println("Resultado IMC: " + pessoa.resultIMC());
            System.out.println();
        }
    }
}

abstract class PessoaExercicio4 {
    public PessoaExercicio4() { }

    public abstract String toString();
}

abstract class PessoaIMC extends PessoaExercicio4 {
    private double peso;
    private double altura;

    public PessoaIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return String.format("Peso: %.2f\nAltura: %.2f", this.peso, this.altura);
    }
}

class Homem extends PessoaIMC {
    public Homem(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getPeso(), getAltura());
        if (imc < 20.7) {
            return "Abaixo do peso";
        } else if (imc <= 26.4) {
            return "Peso normal";
        } else {
            return "Acima do peso";
        }
    }
}

class Mulher extends PessoaIMC {
    public Mulher(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC(getPeso(), getAltura());
        if (imc < 19.1) {
            return "Abaixo do peso";
        } else if (imc <= 25.8) {
            return "Peso normal";
        } else {
            return "Acima do peso";
        }
    }
}

class Vector {
    private List<PessoaExercicio4> pessoaExercicio4s;

    public Vector() {
        pessoaExercicio4s = new ArrayList<>();
    }

    public void add(PessoaExercicio4 pessoaExercicio5) {
        pessoaExercicio4s.add(pessoaExercicio5);
    }

    public PessoaExercicio4 elementAt(int index) {
        return pessoaExercicio4s.get(index);
    }
}