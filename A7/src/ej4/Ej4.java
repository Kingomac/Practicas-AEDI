package ej4;

import java.util.Iterator;
import lista.Lista;

/**
 *
 * @author Mario
 */
public class Ej4 {

    private static <E> int contar(Lista<E> lista, E e) {
        int toret = 0;
        for (E i : lista) {
            if (i.equals(e)) {
                toret++;
            }
        }
        return toret;
    }

    private static <E> int contar2(Lista<E> lista, E e) {
        int toret = 0;
        Iterator<E> it = lista.iterator();
        E el;
        while (it.hasNext()) {
            el = it.next();
            if (el.equals(e)) {
                toret++;
            }
        }
        return toret;
    }

    public static <E> boolean igualVeces(Lista<E> lista) {
        int veces = -1;
        for (E i : lista) {
            if (veces != -1 && contar(lista, i) != veces) {
                return false;
            }
            veces = contar(lista, i);
        }
        return false;
    }

    public static <E> boolean igualVeces2(Lista<E> lista) {
        Iterator<E> it = lista.iterator();
        int numVeces = 0;
        if (it.hasNext()) {
            numVeces = contar2(lista, it.next());
            while (it.hasNext()) {
                if (numVeces != contar(lista, it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
