package cap01;

import java.util.Scanner;

public class DemoMatriz1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el numero de filas: ");
        int numeroFilas = scanner.nextInt();
        
        System.out.print("Digite el numero de columnas: ");
        int numeroColumnas = scanner.nextInt();
        
        int matriz[][] = new int[numeroFilas][numeroColumnas];
        
        for(int i = 0; i < numeroFilas; i++){
            
            for(int j = 0; j < numeroColumnas; j++){
                
                matriz[i][j] = (int)(Math.random() * 1000);
            }
        }
        
        for(int i = 0; i < numeroFilas; i++){
            
            for(int j = 0; j < numeroColumnas; j++){
                
                System.out.print(matriz[i][j] + "\t");
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
