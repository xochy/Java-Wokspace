package cap01;

import java.util.Scanner;

public class DemoArray2 {
    
    public static void main(String[] args) {
        
        String dias[] = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES",
                        "SABADO", "DOMINGO"};
        
        System.out.print("Digite el numero de dia: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int numeroDia = scanner.nextInt();
        
        if(numeroDia <= dias.length){
            
            System.out.println(dias[numeroDia - 1]);
        }
        else{
            System.out.println("Dia incorrecto");
        }

        scanner.close();
    }
}
