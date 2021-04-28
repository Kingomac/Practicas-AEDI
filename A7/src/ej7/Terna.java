package ej7;

import lista.Lista;
import lista.ListaEnlazada;

/**
 *
 * @author Mario
 */
public class Terna<E> {

    private E elemento;
    private int numVeces1, numVeces2;

    public Terna(E e, int n1, int n2) {
        elemento = e;
        numVeces1 = n1;
        numVeces2 = n2;
    }

    public E getElemento() {
        return elemento;
    }

    @Override
    public String toString() {
        return "< " + elemento + " , " + numVeces1 + " , " + numVeces2 + " >";
    }

    public static <E> Lista<Terna<E>> generarListaResumen(Lista<E> l1, Lista<E> l2) {
        Lista<Terna<E>> toret = new ListaEnlazada<>();

        for (E elemento : l1) {
            if (!pertenece(toret, elemento)) {
                int n1 = apariciones(l1, elemento);
                int n2 = apariciones(l2, elemento);

                Terna<E> t = new Terna<>(elemento, n1, n2);
                toret.insertarFinal(t);
            }
        }

        for (E elemento : l2) {
            if (!pertenece(toret, elemento)) {
                int n2 = apariciones(l2, elemento);

                Terna<E> t = new Terna<>(elemento, 0, n2);
                toret.insertarFinal(t);
            }
        }
        return toret;
    }

    private static <E> boolean pertenece(Lista<Terna<E>> lista, E el) {
        for (Terna<E> e : lista) {
            if (e.getElemento().equals(e)) {
                return true;
            }
        }
        return false;
    }

    private static <E> int apariciones(Lista<E> lista, E el) {
        int toret = 0;
        for (E e : lista) {
            if (e.equals(el)) {
                toret++;
            }
        }
        return toret;
    }
}
