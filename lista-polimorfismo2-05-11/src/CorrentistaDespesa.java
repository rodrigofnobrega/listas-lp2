class CorrentistaDespesa extends Correntista {
    private DespesaIndividuo despesasPrevistas;
    
    public CorrentistaDespesa(String cpfCliente, float valor, DespesaIndividuo despesas) {
        super(cpfCliente, valor);
        this.despesasPrevistas = despesas;
    }
    
    public DespesaIndividuo getDespesasPrevistas() {
        return this.despesasPrevistas;
    }
    
    public CorrentistaDespesa[] despesaPrevista(CorrentistaDespesa[] correntistaDespesa) {
        int i = 0;
        int n = correntistaDespesa.length();
        CorrentistaDespesa correntistas = new CorrentistaDespesa[n];
        
        for (CorrentistaDespesa c : correntistaDespesa) {
            if (getDespesasPrevistas().getValor() <= c.getValor()) {
                correntistas[i] = c;
                i++;
            }
        }
        
        return correntistas;
    }
}
