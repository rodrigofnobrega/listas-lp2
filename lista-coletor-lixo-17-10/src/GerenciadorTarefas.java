import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    public static void main(String[] args) throws Exception {
        obterMemoriaUsada();
        List<Tarefa> tarefas = new ArrayList<>();
        limparMemoria();
        obterMemoriaUsada();
        addTarefa(tarefas, 1, "Teste", "Testando");
        listarTarefas(tarefas);
        addTarefa(tarefas, 2, "Tarefa 2", "Testando 2");
        limparMemoria();
        obterMemoriaUsada();
        listarTarefas(tarefas);
        removerTarefa(tarefas, 1);
        listarTarefas(tarefas);
        limparMemoria();
        obterMemoriaUsada();
    }

    public static void addTarefa(List<Tarefa> tarefas, int id, String titulo, String descricao) {
        System.out.println("Memória antes de adicionar");
        obterMemoriaUsada();
        tarefas.add(new Tarefa(id, titulo, descricao));
        System.out.println("Memória depois de adicionar");
        obterMemoriaUsada();
    }

    public static void listarTarefas(List<Tarefa> tarefas) {
        for (Tarefa t : tarefas) {
            System.out.println("ID: " + t.getId());
            System.out.println("Título: " + t.getTitulo());
            System.out.println("Descrição: " + t.getDescricao());
            System.out.println("======================================");
        }
    }

    public static void removerTarefa(List<Tarefa> tarefas, int id) {
        System.out.println("Memória antes de remover");
        obterMemoriaUsada();
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                tarefas.remove(t);
            }
        }
        System.out.println("Memória depois de remover");
        obterMemoriaUsada();
    }

    public static void obterMemoriaUsada() {
        Runtime runtime = Runtime.getRuntime();

        long memoriaTotal = runtime.totalMemory();
        long memoriaLivre = runtime.freeMemory();
        long memoriaUsada = memoriaTotal - memoriaLivre;

        System.out.println("Memória total: " + memoriaTotal / (1024 + 1024) + "MB");
        System.out.println("Memória livre: " + memoriaLivre / (1024 + 1024) + "MB");
        System.out.println("Memória utilizada: " + memoriaUsada / (1024 + 1024) + "MB");
    }

    public static void limparMemoria() {
        System.gc();
    }
}

class Tarefa {
    private int id;
    private String titulo;
    private String descricao;

    public Tarefa(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}