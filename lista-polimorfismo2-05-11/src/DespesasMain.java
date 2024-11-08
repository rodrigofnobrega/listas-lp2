public class DespesasMain {
	public static void main (String[] args) {
		DespesasMes[] despesas = new DespesasMes[2];

		despesas[0] = new DespesasMes(1, 50f);
		despesas[1] = new DespesasMes(2, 100f);


		DespesasTotal despesasTotal = new DespesasTotal("111.222.333-44",despesas);

		System.out.println("Despesa do mes: " + despesasTotal.encontraItem(1));
		System.out.println("Despesa do mes: " + despesasTotal.encontraItem(3));
		System.out.println("CPF: " + despesasTotal.getCpf());
	}
}

class DespesasMes {
	private int mes;
	private float valor;

	public DespesasMes(int mes, float valor) {
		this.mes = mes;
		this.valor = valor;
	}

	public int getMes() {
		return this.mes;
	}

	public float getValor() {
		return this.valor;
	}

	public String toString() {
		return String.format("Mês: %d - Valor: %f", mes, valor);
	}
}

class DespesasDia extends DespesasMes {
	private int dia;

	public DespesasDia(int mes, float valor, int dia) {
		super(mes, valor);
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

}

class DespesasTotal {
	private String cpf;
	private DespesasMes[] despesas;

	public DespesasTotal(String cpf, DespesasMes[] despesas) {
		this.despesas = despesas;
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public DespesasMes encontraItem(int mes) {
		float soma = 0f;

		for (DespesasMes d : despesas) {
			if (d.getMes() == mes) {
				soma += d.getValor();
			}
		}

		return new DespesasMes(mes, soma);
	}
}
