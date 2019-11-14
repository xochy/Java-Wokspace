package cap02;

public class TestFecha1{

    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha("12/11/1990");
        Fecha fecha2 = new Fecha(12, 11, 1990);
        
        if(fecha1.equals(fecha2)){
            System.out.println("Las fechas son iguales");
        }
        else{
            System.out.println("Las fechas no son iguales");
        }
    }
}