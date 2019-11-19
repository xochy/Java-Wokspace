package cap01;

import java.util.Scanner;

public class Cadenas7 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor entero: ");
        
        int valor = scanner.nextInt();
        
        System.out.println("Valor ingresado: " + valor);
        System.out.println("Binario: " + Integer.toBinaryString(valor));
        System.out.println("Octal: " + Integer.toOctalString(valor));
        System.out.println("Hexadecimal: " + Integer.toHexString(valor));
        
        System.out.print("Ingrese una base numerica: ");
        
        int base = scanner.nextInt();
        
        String baseN = Integer.toString(valor, base);
        System.out.println(valor + " en base (" + base + ") = " + baseN);

        scanner.close();
    }
}
