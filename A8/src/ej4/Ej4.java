package ej4;

/**
 *
 * @author Mario
 */
public class Ej4 {

    public static int busquedaInsercionDe(int aux[], int elem, int max) {
        int inicio = 0;
        int fin = max;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (aux[medio] > elem) {
                inicio = medio + 1;
            } else if (aux[medio] < elem) {
                fin = medio - 1;
            } else {
                return medio;
            }
        }

        for (int i = max; i >= inicio; i--) {
            aux[i + 1] = aux[i];
        }
        aux[inicio] = elem;
        return inicio;
    }
}
