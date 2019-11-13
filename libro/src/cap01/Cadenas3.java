package cap01;

public class Cadenas3 {

    public static void main(String[] args) {
        
        String cadena = "Esto es una Cadena de Caracteres";
        
        int pos1 = cadena.indexOf('C');
        int pos2 = cadena.lastIndexOf('C');
        int pos3 = cadena.indexOf('x');
        
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
