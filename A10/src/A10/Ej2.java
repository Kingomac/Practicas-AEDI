package A10;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mario
 */
public class Ej2 {

    private static int indice(int numero, int pasada) { //Produce:  el  dígito  de  número,  que  está  en  la  posición  pasada.  Para  un  numero  de  tres  dígitos,  pasada tomará los valores 0, 1 y 2, devolviendo las unidades, decenas o centenas respectivamente.
        return (numero / ((int) Math.pow(10, pasada))) % 10;
    }

    public static void ordenacionRaiz(int[] numeros) {
        Queue<Integer>[] colas = new Queue[10];
        for (int i = 0; i < colas.length; i++) {
            colas[i] = new LinkedList<>();
        }

        for (int pasada = 0; pasada < 3; pasada++) {
            for (int i = 0; i < numeros.length; i++) {
                int ind = indice(numeros[i], pasada);
                colas[ind].add(numeros[i]);
            }
        }

        int posArray = 0;
        for (int i = 0; i < colas.length; i++) {
            while (!colas[i].isEmpty()) {
                numeros[posArray++] = colas[i].remove();
            }
        }

    }
}
