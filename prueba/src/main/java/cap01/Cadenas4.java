package cap01;

public class Cadenas4 {

    public static void main(String[] args) {
        
        String cadena = "Esta es una Cadena de Caracteres";
        
        String s1 = cadena.substring(0, 7);
        String s2 = cadena.substring(8, 12);
        
        //Toma desde el caractero 8 hasta el final
        String s3 = cadena.substring(8);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
