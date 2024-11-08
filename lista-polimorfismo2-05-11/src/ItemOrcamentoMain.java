public class ItemOrcamentoMain {
    public static void main (String[] args) {
        ItemOrcamento[] itens = new ItemOrcamento[2];
        
        itens[0] = new ItemOrcamento("Sim", 50f);
        itens[1] = new ItemOrcamento("Não", 100f);
        
        
        ItemOrcamentoComplexo complexo = new ItemOrcamentoComplexo("a", 1f, itens);
        
        System.out.println("Soma dos valores: " + complexo.getValor());
        System.out.println("Encontrou: " + complexo.encontraItem("Sim"));
        System.out.println("Encontrou: " + complexo.encontraItem("asdsa"));
    }
}

class ItemOrcamento {
    private String historico;
    private float valor;
    
    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }
    
    public String getHistorico() {
        return this.historico;
    }
    
    public float getValor() {
        return this.valor;
    }
    
    public String toString() {
        return String.format("Histórico: %s - Valor: %f", historico, valor);
    }
}

class ItemOrcamentoComplexo extends ItemOrcamento {
    ItemOrcamento[] itens;
    
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] itens) {
        super(historico, valor);
        this.itens = itens;
    }
    
    @Override
    public float getValor() {
        float soma = 0f;
        
        for (ItemOrcamento f : itens) {
            soma += f.getValor();
        }
        
        return soma;
    }
    
    public ItemOrcamento encontraItem(String historico) {
        for (ItemOrcamento f : itens) {
            if (f.getHistorico().equalsIgnoreCase(historico)) {
                return f;
            }
        }
        
        return null;
    }
}
