package doble;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazada<T> {

    private DobleNodo<T> primero;
    private DobleNodo<T> ultimo;
    private int cont;

    public DoblementeEnlazada() {
        cont = 0;
        primero = ultimo = null;
    }

//    public void insertar(T el) {
//        if (primero == null) {
//            primero = new DobleNodo<>(el, null, null);
//            ultimo = primero;
//        } else if (primero == ultimo) {
//            DobleNodo<T> nuevo = new DobleNodo<>(el, primero, null);
//            primero.setSig(nuevo);
//        } else {
//            DobleNodo<T> nuevo = new DobleNodo<>(el, ultimo, null);
//            ultimo.setSig(nuevo);
//            ultimo = nuevo;
//        }
//        cont++;
//    }
    public void insertar(T el) {
        DobleNodo<T> nuevo = new DobleNodo<>(el, null, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
            nuevo.setAnt(ultimo);
        }
        ultimo = nuevo;
    }

    public boolean eliminar(T el) {
        if (primero == null) {
            return false;
        }
        DobleNodo<T> actual = primero;
        while (actual.getSig() != null && !actual.getEl().equals(el)) {
            actual = actual.getSig();
        }
        if (actual.getEl().equals(el)) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else if (primero == actual) {
                primero = primero.getSig();
                primero.setAnt(null);
            } else if (ultimo == actual) {
                ultimo = ultimo.getAnt();
                ultimo.setSig(null);
            } else {
                actual.getAnt().setSig(actual.getSig());
                actual.getSig().setAnt(actual.getAnt());
            }
            return true;
        }
        return false;
    }

    public boolean esta(T el) {
        for (DobleNodo<T> actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getEl().equals(el)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            toret.append(actual.getEl()).append(" ");
        }
        return toret.toString();
    }
}
