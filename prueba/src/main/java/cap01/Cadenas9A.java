package cap01;

import java.util.Scanner;

public class Cadenas9A {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena1 = scanner.next();
        
        System.out.print("Ingrese una cadena: ");
        String cadena2 = scanner.next();
        
        System.out.println("Cadena1 = [" + cadena1 + "]");
        System.out.println("Cadena2 = [" + cadena2 + "]");
        
        if(cadena1.equals(cadena2)){
            
            System.out.println("Son iguales");
        }
        else{
            
            System.out.println("Son distintas");
        }

        scanner.close();
    }
}
