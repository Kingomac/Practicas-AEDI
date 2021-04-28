package ej1;

/**
 *
 * @author Mario
 */
public class Ej1 {

    public static int cuantosMenores(int[] aux, int el) {
        int inicio = 0;
        int fin = aux.length;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (aux[medio] < el) {
                inicio = medio + 1;
            } else if (aux[medio] > el) {
                inicio = medio - 1;
            } else {
                while (medio >= 0 && aux[medio] == el) {
                    medio--;
                }
                return medio + 1;
            }
        }
        return inicio;
    }

    public static int cuantosMayores(int[] aux, int el) {
        int inicio = 0;
        int fin = aux.length;
        int medio = 0;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (aux[medio] < el) {
                inicio = medio + 1;
            } else if (aux[medio] > el) {
                inicio = medio - 1;
            } else {
                while (medio < aux.length && aux[medio] == el) {
                    medio++;
                }
                return aux.length - medio;
            }
        }
        return aux.length - inicio;
    }
}
