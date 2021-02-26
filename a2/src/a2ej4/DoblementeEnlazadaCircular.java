package a2ej4;

import a2ej2.DobleNodo;

/**
 * Lista circular con enlaces al siguiente elemento y al anterior
 *
 * @author Mario
 */
public class DoblementeEnlazadaCircular {

    private DobleNodo fin;
    private int cont;

    /**
     * Crea una lista vacía
     */
    public DoblementeEnlazadaCircular() {
        fin = null;
        cont = 0;
    }

    /**
     *
     * @return Número de elementos de la lista
     */
    public int getCont() {
        return cont;
    }

    /**
     *
     * @return Primer elemento de la lista
     */
    public int getPrimerEl() {
        return fin.getSig().getEl();
    }

    /**
     *
     * @param el Elemento a buscar
     * @return Número de veces que se repite el elemento
     */
    public int numVeces(int el) {
        int toret = 0;
        for (DobleNodo actual = fin.getSig(); actual != fin; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                toret++;
            }
        }
        return fin.getEl() == el ? toret + 1 : toret;
    }

    /**
     * Inserta un elemento al final de la lista
     *
     * @param el Elemento a insertar
     */
    public void insertarFinal(int el) {
        if (fin == null) {
            fin = new DobleNodo(el, fin, fin);
        } else if (fin.getSig() == null) {
            DobleNodo nuevo = new DobleNodo(el, fin, fin);
            fin.setSig(nuevo);
            fin.setAnt(nuevo);
            fin = nuevo;
        } else {
            DobleNodo nuevo = new DobleNodo(el, fin.getSig(), fin);
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }

    /**
     * Borra el primer elemento de la lista
     */
    public void borrarPrimero() {
        if (fin == null) {
            System.out.println("Lista vacía");
        } else if (fin.getSig() == fin) {
            fin = null;
        } else {
            fin.getSig().getSig().setAnt(fin);
            fin.setSig(fin.getSig().getSig());
        }
    }

    @Override
    public String toString() {
        if (fin != null) {
            StringBuilder toret = new StringBuilder();
            DobleNodo actual = fin.getSig();
            while (actual.getSig() != fin) {
                toret.append(actual.getEl());
                toret.append(", ");
                actual = actual.getSig();
            }
            toret.append(fin.getEl());
            return toret.toString();
        } else {
            return "Lista vacía";
        }
    }
}
