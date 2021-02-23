package a2ej2;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazada {

    private DobleNodo primero, ultimo;
    private int cont;

    public DoblementeEnlazada() {
        primero = ultimo = null;
    }

    public int veces(int el) {
        int veces = 0;
        for (DobleNodo actual = primero; actual.getSig() != null; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                veces++;
            }
        }
        return veces;
    }

    public void insertarPrimero(int el) {
        if (primero == null) {
            DobleNodo nuevo = new DobleNodo(el, null, null);
            primero = ultimo = nuevo;
        } else if (primero == ultimo) {
            DobleNodo nuevo = new DobleNodo(el, null, ultimo);
            primero = nuevo;
            ultimo.setAnt(primero);
        } else {
            DobleNodo nuevo = new DobleNodo(el, primero, null);
            primero.setAnt(nuevo);
            primero = nuevo;
        }
    }

    public void insertarFinal(int el) {
        if (primero == null) {
            DobleNodo nuevo = new DobleNodo(el, null, null);
            primero = ultimo = nuevo;
        } else if (primero == ultimo) {
            DobleNodo nuevo = new DobleNodo(el, null, primero);
            ultimo = nuevo;
            primero.setSig(ultimo);
        } else {
            DobleNodo nuevo = new DobleNodo(el, null, ultimo);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
    }

    public void borrar(int el) {
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            DobleNodo actual = primero;
            while (actual.getSig().getSig() != null && actual.getEl() != el) {
                actual = actual.getSig();
            }
            if (actual == primero) {
                primero = primero.getSig();
                primero.setAnt(null);
            } else if (actual == ultimo) {
                ultimo = ultimo.getAnt();
                ultimo.setSig(null);
            } else {
                //actual.getAnt().setSig(actual.getSig());
                //actual.getSig().setAnt(actual.getAnt());
                actual.setSig(actual.getSig().getSig());
                actual.getSig().getSig().setAnt(actual);
            }
        }
    }

    public int getPrimero() {
        return primero.getEl();
    }

    public int getUltimo() {
        return ultimo.getEl();
    }

    public String toString() {
        StringBuilder toret = new StringBuilder();
        DobleNodo actual = primero;
        while (actual.getSig() != null) {
            toret.append(actual.getEl());
            toret.append(", ");
            actual = actual.getSig();
        }
        toret.append(actual.getEl());
        toret.append(", ");
        toret.append(ultimo.getEl());
        return toret.toString();
    }
}
