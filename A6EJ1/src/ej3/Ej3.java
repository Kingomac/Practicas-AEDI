package ej3;

import ej1.Cola;
import ej1.EnlazadaCircular;

/**
 *
 * @author Mario
 */
public class Ej3 {

    public static Cola<Integer> mezcla(Cola<Integer> cola1, Cola<Integer> cola2) {
        Cola<Integer> toret = new EnlazadaCircular<>();
        Cola<Integer> temp1 = new EnlazadaCircular<>();
        Cola<Integer> temp2 = new EnlazadaCircular<>();
        Integer i;
        while (!cola1.esVacio() && !cola2.esVacio()) {
            if (cola1.primero() < cola2.primero()) {
                i = cola1.suprimir();
                temp1.insertar(i);
            } else if (cola2.primero() < cola1.primero()) {
                i = cola2.suprimir();
                temp2.insertar(i);
            } else {
                i = cola1.suprimir();
                cola2.suprimir();
                temp1.insertar(i);
                temp2.insertar(i);
            }
            toret.insertar(i);
        }
        while (!cola1.esVacio()) {
            toret.insertar(cola1.primero());
            temp1.insertar(cola1.suprimir());
        }

        while (!cola2.esVacio()) {
            toret.insertar(cola2.primero());
            temp2.insertar(cola2.suprimir());
        }

        while (!temp1.esVacio()) {
            cola1.insertar(temp1.suprimir());
        }

        while (!temp2.esVacio()) {
            cola2.insertar(temp2.suprimir());
        }

        return toret;
    }
}
