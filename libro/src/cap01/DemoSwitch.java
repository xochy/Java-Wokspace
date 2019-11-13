package cap01;

import java.util.Scanner;

public class DemoSwitch {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el número de día: ");
        
        int valorDia = scanner.nextInt();
        
        String dia;
        
        switch(valorDia){
            
            case 1: dia = "Lunes"; break;
            case 2: dia = "Martes"; break;
            case 3: dia = "Miercoles"; break;
            case 4: dia = "Jueves"; break;
            case 5: dia = "Viernes"; break;
            case 6: dia = "Sábado"; break;
            case 7: dia = "Domingo"; break;
            default: dia = "Día incorrecto...el valor debe ser entre 1 y 7";
        }
        
        System.out.println(dia);

        scanner.close();
    }
}
