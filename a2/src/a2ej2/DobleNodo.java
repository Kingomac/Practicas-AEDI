package a2ej2;

/**
 *
 * @author Mario
 */
public class DobleNodo {

    private final int elemento;
    private DobleNodo siguiente;
    private DobleNodo anterior;

    public DobleNodo(int el, DobleNodo sig, DobleNodo ant) {
        elemento = el;
        siguiente = sig;
        anterior = ant;
    }

    public DobleNodo getSig() {
        return siguiente;
    }

    public DobleNodo getAnt() {
        return anterior;
    }

    public void setSig(DobleNodo sig) {
        siguiente = sig;
    }

    public void setAnt(DobleNodo ant) {
        anterior = ant;
    }

    public int getEl() {
        return elemento;
    }
}
