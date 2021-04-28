package ej6;

import lista.Lista;
import lista.ListaEnlazada;

/**
 *
 * @author Mario
 */
public class Ej6 {

    public static void main(String[] args) {

    }

    public static <E> Lista<E> repetidos(Lista<E> lista) {
        Lista<E> toret = new ListaEnlazada<>();
        int cont = 0;
        for (E e : lista) {
            if (!toret.contiene(e)) {
                cont = 0;

                for (E l : lista) {
                    if (l.equals(e)) {
                        cont++;
                    }
                }

                if (cont > 1) {
                    toret.insertarFinal(e);
                }
            }
        }
        return toret;
    }
}
