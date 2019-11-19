package cap01;

public class Cadenas8B {
    
    public static void main(String[] args) {
        
        String cadena = "Juan|Marcos|Carlos|Matias";
        String[] tokens = cadena.split("[|]");
        
        for(int i = 0; i < tokens.length; i++){
            
            System.out.println(tokens[i]);
        }
    }
}
