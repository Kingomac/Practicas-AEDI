package ej3;

/**
 *
 * @author Mario
 */
public class OrdenadaEnlazadaCentinela {

    private Nodo primero;

    public OrdenadaEnlazadaCentinela() {
        primero = new Nodo(-0, null);
    }

    public boolean esta(int el) {
        if (primero.getSig() == null) {
            return false;
        }
        for (Nodo actual = primero.getSig(); actual.getSig() != null; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                return true;
            }
        }
        return false;
    }

    public void insertarFinal(int el) {
        Nodo actual = primero;
        while (actual.getSig() != null) {
            actual = actual.getSig();
        }
        actual.setSig(new Nodo(el, null));
    }

    public void insertarPrimero(int el) {
        Nodo nuevo = new Nodo(el, primero.getSig());
        primero.setSig(nuevo);
    }

    public void borrar(int el) {
        if (primero.getSig() != null) {
            Nodo actual = primero.getSig();
            while (actual.getSig().getSig() != null && actual.getSig().getEl() != el) {
                actual = actual.getSig();
            }
            if (actual.getSig().getEl() == el) {
                actual.setSig(actual.getSig().getSig());
            }
        }
    }

    @Override
    public String toString() {
        if (primero.getSig() == null) {
            return "Lista vacía";
        }
        StringBuilder toret = new StringBuilder();
        Nodo actual = primero.getSig();
        for (; actual.getSig() != null; actual = actual.getSig()) {
            toret.append(actual.getEl()).append(", ");
        }
        return toret.toString();
    }
}
