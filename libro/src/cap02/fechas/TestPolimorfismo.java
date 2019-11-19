package cap02.fechas;

public class TestPolimorfismo{

    public static void main(String[] args) {
        
        Fecha fec  = new FechaDetallada("12/11/1990");
        Object obj = new FechaDetallada("3/11/1990");

        System.out.println("fec = " + fec);
        System.out.println("obj = " + obj);
    }
}