package cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {
    
    public static void main(String[] args) {
        
        System.out.print("Digita la cantidad de valores: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidadNumeros = scanner.nextInt();
        
        int i = 1;
        
        do{
            
            System.out.println(i++);
            
        }while(i <= cantidadNumeros);

        scanner.close();
    }
}
