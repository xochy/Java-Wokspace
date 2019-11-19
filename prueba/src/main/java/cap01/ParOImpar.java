package cap01;

import java.util.Scanner;

public class ParOImpar 
{    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
    
        int numero = scanner.nextInt();
        
        int residuo = numero % 2;
        
        if(residuo == 0)
        {
            System.out.println("El valor es par");
        }
        else
        {
            System.out.println("El valor es impar");
        }

        scanner.close();
    }
}
