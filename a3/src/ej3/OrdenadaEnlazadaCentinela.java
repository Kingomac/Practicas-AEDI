package ej3;

/**
 *
 * @author Mario
 */
public class OrdenadaEnlazadaCentinela {

    private Nodo centinela;
    private int numElem;

    public OrdenadaEnlazadaCentinela() {
        centinela = new Nodo(Integer.MIN_VALUE, null);
        numElem = 0;
    }

    public boolean esta(int el) {
        Nodo actual = centinela.getSig();
        // Como está ordenada se puede salir por haber encontradon un elemento mayor
        // y entonces no hace falta seguir recorriendo la lista
        while (actual != null && actual.getEl() < el) {
            actual = actual.getSig();
        }
        if (actual == null || actual.getEl() > el) {
            return false;
        } else {
            return true;
        }
    }

    public void insertar(int el) {
        Nodo nuevo = new Nodo(el, null);
        Nodo actual = centinela;
        while (actual.getSig() != null && actual.getSig().getEl() < el) {
            actual = actual.getSig();
        }
        nuevo.setSig(actual.getSig());
        actual.setSig(nuevo);
        numElem++;
    }

    public void borrar(int el) {
        Nodo actual = centinela;
        if (actual.getSig() == null) {
            System.out.println("Lista vacía");
        } else {
            while (actual.getSig() != null && actual.getSig().getEl() < el) {
                actual = actual.getSig();
            }
            if (actual.getSig() == null || actual.getSig().getEl() > el) {
                System.out.println("El elemento no está en la lista");
            } else {
                actual.setSig(actual.getSig().getSig());
                numElem--;
            }
        }
    }

    @Override
    public String toString() {
        String toret = "";

        for (Nodo actual = centinela.getSig(); actual != null; actual = actual.getSig()) {
            toret += actual.getEl() + ", ";
        }

        return toret;
    }
}
