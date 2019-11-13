package cap01;

public class Cadenas1 {
    
    public static void main(String[] args) {
        
        String cadena = "Esta es mi cadena";
        
        System.out.println(cadena.charAt(0));
        System.out.println(cadena.charAt(5));
        System.out.println(cadena.charAt(cadena.length() - 1));
                
        for(int i = 0; i < cadena.length(); i++){
            
            System.out.println(i + "->" + cadena.charAt(i));
        }
    }
}
