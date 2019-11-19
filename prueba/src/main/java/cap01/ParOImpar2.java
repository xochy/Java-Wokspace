package cap01;

import java.util.Scanner;

public class ParOImpar2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un valor: ");
        
        int valor = scanner.nextInt();
        
        String mensaje = (valor == 0) ? "es par" : "es impar";
        
        System.out.println(valor + " " + mensaje);

        scanner.close();
    }
}