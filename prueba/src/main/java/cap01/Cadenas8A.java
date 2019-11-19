package cap01;

import java.util.StringTokenizer;

public class Cadenas8A {

    public static void main(String[] args) {
        
        String cadena = "Juan|Marcos|Carlos|Matias";
        
        StringTokenizer stringTokenizer = new StringTokenizer(cadena, "|");
                
        while(stringTokenizer.hasMoreTokens()){
            
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
