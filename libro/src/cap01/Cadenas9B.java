package cap01;

public class Cadenas9B {

    public static void main(String[] args) {
        
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        
        System.out.println("Cadena1 = [" + cadena1 + "]");
        System.out.println("Cadena2 = [" + cadena2 + "]");
        
        if(cadena1 == cadena2){
        //if(cadena1.equals(cadena2)){
            
            System.out.println("Son iguales");
        }
        else{
            
            System.out.println("Son distintas");
        }
    }
}
