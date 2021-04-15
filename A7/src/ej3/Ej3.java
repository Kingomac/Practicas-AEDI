package ej3;

import lista.Lista;
import lista.ListaEnlazada;

/**
 *
 * @author Mario
 */
public class Ej3 {

    public static <E> Lista<E> invertir(Lista<E> lista) {
        Lista<E> toret = new ListaEnlazada<>();
        for (E i : lista) {
            toret.insertarPrincipio(i);
        }
        return toret;
    }
}
