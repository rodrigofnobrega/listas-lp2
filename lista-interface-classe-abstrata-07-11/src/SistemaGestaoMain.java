public class SistemaGestaoMain {
    public static void main(String[] args) {
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(2000, 5);
        Funcionario funcionarioHorista = new FuncionarioHorista(10, 10, 80);

        System.out.println("Salário funcionário assalariado: R$" + funcionarioAssalariado.calcularSalario());
        System.out.println("Salário funcionário horista: R$" + funcionarioHorista.calcularSalario());
    }
}

interface Bonus {
    double calcularBonus();
}

abstract class Funcionario implements Bonus{
    private double salario;
    private double valorBonus;

    public Funcionario(double salario, double valorBonus) {
        this.salario = salario;
        this.valorBonus = valorBonus;
    }

    public double calcularSalarioAssalariado() {
        return this.salario;
    }

    public abstract double calcularSalario();

    public double getSalario() {
        return salario;
    }

    public double getValorBonus() {
        return valorBonus;
    }
}

class FuncionarioAssalariado extends Funcionario {
    public FuncionarioAssalariado(double salario, double valorBonus) {
        super(salario, valorBonus);
    }

    @Override
    public double calcularSalario() {
        return calcularSalarioAssalariado() + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return getValorBonus() * 15.0;
    }
}

class FuncionarioHorista extends Funcionario {
    private int horas;

    public FuncionarioHorista(double salario, double valorBonus, int horas) {
        super(salario, valorBonus);
        this.horas = horas;
    }

    @Override
    public double calcularBonus() {
        return getValorBonus() * (horas / 4);
    }

    @Override
    public double calcularSalario() {
        return (getSalario() * horas) + calcularBonus();
    }
}