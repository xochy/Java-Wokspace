package cap01;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        //Mensaje para el usuario
        System.out.print("Ingrese nombre edad altura: ");
        
        //Leemos el nombre
        String nombre = scanner.next();
        
        //Leemos la edad
        int edad = scanner.nextInt();
        
        //Leemos la altura
        double altura = scanner.nextDouble();
        
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);

        scanner.close();
    }
}
