import java.time.LocalDate;
import java.time.LocalDateTime;

public class SistemaPagamentoMain {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito(100, "Rodrigo",
                new Integer[]{1111, 2222, 3333, 4444}, 123, LocalDate.now().minusMonths(4));
        Pagamento boletoBancario = new BoletoBancario(250, "1234.12341 431241.4321 234321.43000");
        Pagamento pix = new Pix(300, "email@email.com");

        cartaoCredito.realizarPagamento();
        boletoBancario.realizarPagamento();
        pix.realizarPagamento();
    }
}

abstract class Pagamento implements Autenticacao {
    private Integer valor;

    public Pagamento(Integer valor) {
        this.valor = valor;
    }

    public abstract void realizarPagamento();

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}

interface Autenticacao {
    Boolean autenticar();
}

class CartaoCredito extends Pagamento {
    private String nomeCartao;
    private Integer[] numero = new Integer[4];
    private Integer cvv;
    private LocalDate validade;

    public CartaoCredito(Integer valor, String nomeCartao, Integer[] numero, Integer cvv, LocalDate validade) {
        super(valor);
        this.nomeCartao = nomeCartao;
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
    }

    public Boolean isValidoNome(String nome) {
        return !nome.isBlank();
    }

    public Boolean isValidoNumero(Integer[] numero) {
        for (Integer i : numero) {
            if (i <= 0) {
                System.out.println("O número " + i + "Entrou");
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }

    public Boolean isValidoCvv(Integer cvv) {
        return cvv > 0;
    }

    public Boolean isValidoValidade(LocalDate validade) {
        return validade.isBefore(LocalDate.now());
    }

    @Override
    public Boolean autenticar() {
        if (!isValidoNome(nomeCartao)) {
            System.out.println("Nome inválido");
            return Boolean.FALSE;
        }
        if (!isValidoCvv(cvv)) {
            System.out.println("CVV inválido");
            return Boolean.FALSE;
        }
        if (!isValidoValidade(validade)) {
            System.out.println("Cartão expirado");
            return Boolean.FALSE;
        }
        if (!isValidoNumero(numero)) {
            System.out.println("Número do cartão é inválido");
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    @Override
    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("==================================================");
            System.out.println("|| Realizando pagamento no cartão de crédito    ||");
            System.out.println("|| Valor: R$" + getValor()+"                                 ||");
            System.out.println("|| Horário: " + LocalDateTime.now()+"       ||");
            System.out.println("==================================================\n");
        }
    }
}

class BoletoBancario extends Pagamento {
    private String codigoBarra;

    public BoletoBancario(Integer valor, String codigoBarra) {
        super(valor);
        this.codigoBarra = codigoBarra;
    }

    @Override
    public Boolean autenticar() {
        if (codigoBarra.isBlank()) {
            System.out.println("Código de barras inválido");
        }
        return Boolean.TRUE;
    }

    @Override
    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("==================================================");
            System.out.println("|| Realizando pagamento no boleto bancário      ||");
            System.out.println("|| Valor: R$" + getValor()+"                                 ||");
            System.out.println("|| Horário: " + LocalDateTime.now()+"       ||");
            System.out.println("==================================================\n");
        }
    }
}

class Pix extends Pagamento {
    private String chavePix;

    public Pix(Integer valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public Boolean autenticar() {
        if (chavePix.isBlank()) {
            System.out.println("Chave PIX inválida");
        }
        return Boolean.TRUE;
    }

    @Override
    public void realizarPagamento() {
        if (autenticar()) {
            System.out.println("==================================================");
            System.out.println("|| Realizando pagamento no PIX                  ||");
            System.out.println("|| Valor: R$" + getValor()+"                                 ||");
            System.out.println("|| Horário: " + LocalDateTime.now()+"       ||");
            System.out.println("==================================================\n");
        }
    }
}