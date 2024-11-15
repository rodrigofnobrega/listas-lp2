public class DataExercício1 {
    private byte dia, mes;
    private short ano;

    // O erro dessa classe consiste no construtor ser privado.
    // Os construtores precisam ser publics
    private DataExercício1(byte dd, byte mm, byte aa) {
        dia = dd; mes = mm; ano = aa;
    }
}

public class Ponto2D {
    private double x, y;

    public Ponto2D(double _x, double _y) {
        x = _x; y = _y;
    }
    // O erro dessa classe consiste em existir dois construtores com a mesma quantidade de parâmetros do mesmo tipo
    public Ponto2D(double coord1, double coord2) {
        x = coord1; y = coord2;
    }
}

public class DemoConstrutor {
    private int a, b;

    public DemoConstrutor() {
        System.out.println("No construtor sem argumentos...");
        // Para ser possível chamar um construtor dentro de outro construtor tem que ser usado o this(0, 0)
        DemoConstrutor(0, 0); // this(0,0);
    }

    public DemoConstrutor(int xa, int xb) {
        System.out.println("No construtor com argumentos");
        a = xa; b = xb;
    }
}
