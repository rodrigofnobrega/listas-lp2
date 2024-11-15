public class DataExercicio2 {
    private byte dia, mes;
    private short ano;

    public DataExercicio2(byte dd, byte mm, byte aa) {
        setDia(dd);
        setMes(mm);
        setAno(aa);
    }

    public void setDia(byte dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }
    }

    public void setMes(byte mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    public void setAno(short ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }
}