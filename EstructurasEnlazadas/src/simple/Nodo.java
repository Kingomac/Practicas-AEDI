package simple;

/**
 *
 * @author Mario
 */
public class Nodo<E> {

    private final E el;
    private Nodo<E> sig;

    public Nodo(E el, Nodo<E> sig) {
        this.el = el;
        this.sig = sig;
    }

    public E getEl() {
        return el;
    }

    public Nodo<E> getSig() {
        return sig;
    }

    public void setSig(Nodo<E> sig) {
        this.sig = sig;
    }

}
