package cap02.fechas;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {

        this.dia  = dia;
        this.mes  = mes;
        this.anio = anio;
    }

    public Fecha(String s){

        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');

        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private int fechaToDias(){

        return anio * 360 + mes * 30 + dia;
    }

    private void diasToFecha(int i){

        anio = (int)i / 30;

        int resto = i % 360;

        mes = (int) resto /30;

        dia = resto % 30;

        if(dia == 0){
            dia = 30;
            mes--;
        }

        if (mes == 0){
            mes = 12;
            anio--;
        }
    }

    public void addDias(int d){

        int sum = fechaToDias() + d;
        diasToFecha(sum);
    }

    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnio();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fecha)) {
            return false;
        }
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }
}