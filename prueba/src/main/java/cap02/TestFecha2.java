package cap02;

import java.util.Scanner;

public class TestFecha2{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una fecha (dd/mm/aaaa): ");

        String sFecha = scanner.next();

        Fecha f = new Fecha(sFecha);

        System.out.println("La fecha ingresada es: " + f);

        System.out.print("Ingrese los dias a sumar (puede ser negativo): ");

        int diasSum = scanner.nextInt();

        f.addDias(diasSum);

        System.out.println("Sumando " + diasSum + " dias, queda : " + f);

        scanner.close();
    }
}