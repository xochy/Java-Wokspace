package cap01;

public class Cadenas6A {
    
    public static void main(String[] args) {
        
        long hi = System.currentTimeMillis();
        
        StringBuffer stringBuffer = new StringBuffer();
        
        int n = 100000; 
        
        char c;
        
        for(int i =0; i<n; i++){
            
            c = (char)('A' + i % ('Z' - 'A' +1));
            
            stringBuffer.append(c);
        }
        
        long hf = System.currentTimeMillis();
        
        System.out.println(stringBuffer.toString());
        
        System.out.println((hf - hi) + " milisegundos");
    }
}
