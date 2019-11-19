package cap02.fechas;

public class FechaHora extends FechaDetallada{

    private int hora;
    private int minuto;
    private int segundo;

    public FechaHora(String sFecha, int hora, int minuto, int segundo){

        super(sFecha);

        this.hora    = hora;
        this.minuto  = minuto;
        this.segundo = segundo;
    }


    @Override
    public String toString() {
        
        return super.toString() + " (" + hora + ":" + minuto + ":" + segundo + ")";
    }
    
}