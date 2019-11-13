package cap01;

public class Cadenas6 {
 
    public static void main(String[] args) {
        
        String cadena = "Un buen libro de Java, un buen material";
        
        int pos1 = cadena.indexOf("buen");
        int pos2 = cadena.lastIndexOf("buen");
        
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
