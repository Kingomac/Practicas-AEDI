package ej2;

import java.util.Iterator;
import lista.Lista;
import lista.ListaEnlazada;

/**
 *
 * @author Mario
 */
public class Ej2 {

    public static Lista<Integer> mayoresWhile(Lista<Integer> lista, int num) {
        Lista<Integer> toret = new ListaEnlazada<>();
        //Forma --> While
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i > num) {
                toret.insertarFinal(i);
            }
        }

        return toret;
    }

    public static Lista<Integer> mayoresForEach(Lista<Integer> lista, int num) {
        Lista<Integer> toret = new ListaEnlazada<>();
        //Forma --> Bucle ForEach
        for (Integer i : lista) {
            if (i > num) {
                toret.insertarFinal(i);
            }
        }

        return toret;
    }

}
