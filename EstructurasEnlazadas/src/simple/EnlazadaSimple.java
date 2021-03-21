package simple;

/**
 *
 * @author Mario
 */
public class EnlazadaSimple<T> {

    private Nodo<T> primero;
    private int cont;

    public EnlazadaSimple() {
        primero = null;
    }

    public void insertar(T el) {
        if (primero == null) {
            primero = new Nodo(el, primero);
        } else {
            Nodo actual = primero;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(new Nodo(el, null));
        }
        cont++;
    }

    public boolean esta(T el) {
        for (Nodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getEl().equals(el)) {
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(T el) {
        if (primero.getEl().equals(el)) {
            primero = primero.getSig();
            return true;
        }
        Nodo actual = primero;
        while (actual.getSig() != null && !actual.getSig().getEl().equals(el)) {
            actual = actual.getSig();
        }
        if (actual.getSig().getEl().equals(el)) {
            actual.setSig(actual.getSig().getSig());
            return true;
        }
        return false;
    }

    public int eliminarTodos(T el) {
        int toret = 0;
        if (primero.getEl().equals(el)) {
            primero = primero.getSig();
            toret++;
        }
        Nodo actual = primero;
        while (actual.getSig() != null) {
            if (actual.getSig().getEl().equals(el)) {
                actual.setSig(actual.getSig().getSig());
                toret++;
            }
        }
        return toret;
    }

    public boolean esVacia() {
        return cont == 0;
    }

    public int getCont() {
        return cont;
    }
}
