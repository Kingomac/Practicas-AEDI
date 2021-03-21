package doble;

/**
 *
 * @author Mario
 */
public class DobleNodo<E> {

    private DobleNodo<E> ant;
    private DobleNodo<E> sig;
    private final E el;

    public DobleNodo(E el, DobleNodo<E> ant, DobleNodo<E> sig) {
        this.el = el;
        this.ant = ant;
        this.sig = sig;
    }

    public DobleNodo<E> getAnt() {
        return ant;
    }

    public DobleNodo<E> getSig() {
        return sig;
    }

    public E getEl() {
        return el;
    }

    public void setAnt(DobleNodo<E> ant) {
        this.ant = ant;
    }

    public void setSig(DobleNodo<E> sig) {
        this.sig = sig;
    }
}
