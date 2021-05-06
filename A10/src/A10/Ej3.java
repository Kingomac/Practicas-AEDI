package A10;

/**
 *
 * @author Mario
 */
public class Ej3 {

    public static void ordenarDescendente(int[] aux) {
        for (int i = 0; i < aux.length - 1; i++) {
            int posMayor = mayor(aux, i, aux.length);
            if (i != posMayor) {
                int temp = aux[i];
                aux[i] = aux[posMayor];
                aux[posMayor] = temp;
            }
        }
        if (aux[aux.length - 2] < aux[aux.length - 1]) {
            int temp = aux[aux.length - 2];
            aux[aux.length - 2] = aux[aux.length - 1];
            aux[aux.length - 1] = temp;
        }
    }

    private static int mayor(int[] aux, int inicio, int fin) {
        int mayor = inicio;
        for (int i = inicio + 1; i < fin; i++) {
            if (aux[i] > aux[mayor]) {
                mayor = i;
            }
        }
        return mayor;
    }
}
