package cap01;

import java.util.Scanner;

public class PrimerosNumeros3 {
    
    public static void main(String[] args) {
        
        System.out.print("Digite la cantidad de valores: ");
        
        Scanner scanner = new Scanner(System.in);
              
        int cantidadNumeros = scanner.nextInt();
        
        for(int i = 1; i <= cantidadNumeros; i++){
            
            System.out.println(i);
        }

        scanner.close();
    }
}
