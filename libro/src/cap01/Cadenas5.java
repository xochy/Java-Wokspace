package cap01;

public class Cadenas5 {

    public static void main(String[] args) {
        
        String cadena = "Un buen libro de Java";
        
        boolean b1 = cadena.startsWith("Un buen");
        boolean b2 = cadena.startsWith("A");
        boolean b3 = cadena.endsWith("Java");
        boolean b4 = cadena.endsWith("C");
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
