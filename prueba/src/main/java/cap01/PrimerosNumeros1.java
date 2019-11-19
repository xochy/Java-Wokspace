package cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite la cantidad de valores: ");
        
        int cantidad = scanner.nextInt();
        
        int i = 1;
        
        while(i <= cantidad){
            
            System.out.println(i++);
        }

        scanner.close();
    }
}
