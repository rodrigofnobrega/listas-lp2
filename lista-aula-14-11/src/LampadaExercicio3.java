public class LampadaExercicio3 {
    private boolean estado;

    public LampadaExercicio3(boolean estadoInicial) {
        this.estado = estadoInicial;
    }

    public boolean isAcesa() {
        return estado;
    }

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }
}
