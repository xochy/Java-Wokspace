package cap02.colecciones;

public class MiColeccion {

    private Object datos[] = null;
    private int len = 0;

    public MiColeccion(int capacidadInicial) {

        datos = new Object[capacidadInicial];
    }

    // *Este método debe ser rediseñado
    public Object obtener(int pos) {

        return datos[pos];
    }

    public int cantidad() {

        return len;
    }

    public void insertar(Object elm, int i) {

        if (len == datos.length) {

            Object aux[] = datos;
            datos = new Object[datos.length * 2];

            for (int j = 0; j < len; j++) {

                datos[j] = aux[j];
            }
        }

        for (int j = len - 1; j >= i; j--) {

        }
    }
}