package ej2;

import ej1.Cola;
import ej1.EnlazadaCircular;

/**
 *
 * @author Mario
 */
public class Ej2 {

    public static <E> void concatenar(Cola<E> q1, Cola<E> q2) {
        while (!q2.esVacio()) {
            q1.insertar(q2.suprimir());
        }
    }

    public static <E> Cola<E> barajar(Cola<E> q1, Cola<E> q2) {
        Cola<E> toret = new EnlazadaCircular<>();
        while (!q1.esVacio() && !q2.esVacio()) {
            toret.insertar(q2.suprimir());
            toret.insertar(q1.suprimir());
        }
        while (!q1.esVacio()) {
            toret.insertar(q1.suprimir());
        }

        while (!q2.esVacio()) {
            toret.insertar(q2.suprimir());
        }

        return toret;
    }
}
