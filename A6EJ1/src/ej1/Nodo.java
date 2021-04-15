package ej1;

/**
 *
 * @author Mario
 * @param <E>
 */
public class Nodo<E> {

    private Nodo<E> sig;
    private E el;

    public Nodo(E el, Nodo<E> sig) {
        this.sig = sig;
        this.el = el;
    }

    public Nodo() {
        this(null, null);
    }

    public Nodo<E> getSig() {
        return sig;
    }

    public void setSig(Nodo<E> sig) {
        this.sig = sig;
    }

    public E getEl() {
        return el;
    }

    public void setEl(E el) {
        this.el = el;
    }
}
