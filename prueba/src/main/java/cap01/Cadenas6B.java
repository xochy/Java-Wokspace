package cap01;

public class Cadenas6B {
    
    public static void main(String[] args) {
        
        long hi = System.currentTimeMillis();
        
        String cadena = "";
        
        int n = 100000; 
        
        char c;
        
        for(int i =0; i<n; i++){
            
            c = (char)('A' + i % ('Z' - 'A' +1));
            
            cadena = cadena + c;
        }
        
        long hf = System.currentTimeMillis();
        
        System.out.println(cadena);
        
        System.out.println((hf - hi) + " milisegundos");
    }
}
