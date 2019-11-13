package cap01;

import java.util.Scanner;

public class DemoArray1 {
    
    public static void main(String[] args) {
        
        int array[] = new int[10];
        
        System.out.print("Ingresa un número: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        int i = 0;
        
        while(numero != 0 && i < 10){
            
            array[i++] = numero;
            
            System.out.print("Digite el siguiente número: ");
            numero = scanner.nextInt();
        }
        
        for(int j = 0; j < i; j++){
            
            System.out.println(array[j]);
        }

        scanner.close();
    }
}
