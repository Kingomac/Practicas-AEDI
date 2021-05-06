package A10;

/**
 *
 * @author Mario
 */
public class Ej1 {

    public static void ordenacionBurbuja2Direc(int[] aux) {
        int pasadasTotal = (aux.length - 1) / 2;

        for (int actual = 0; actual < pasadasTotal; actual++) {
            for (int i = actual; i < pasadasTotal - 1; i++) {
                if (aux[i] > aux[i + 1]) {
                    int temp = aux[i];
                    aux[i] = aux[i + 1];
                    aux[i + 1] = temp;
                }
            }
            for (int i = pasadasTotal - actual - 2; i > actual + 1; i--) {
                if (aux[i] < aux[i - 1]) {
                    int temp = aux[i];
                    aux[i] = aux[i - 1];
                    aux[i - 1] = temp;
                }
            }
        }
    }
}
