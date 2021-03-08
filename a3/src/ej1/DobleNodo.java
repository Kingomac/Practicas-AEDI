package ej1;

/**
 *
 * @author Mario
 */
public class DobleNodo {

    private DobleNodo ant;
    private DobleNodo sig;
    private int el;

    public DobleNodo(int el, DobleNodo sig, DobleNodo ant) {
        this.ant = ant;
        this.sig = sig;
        this.el = el;
    }

    public DobleNodo getAnt() {
        return ant;
    }

    public DobleNodo getSig() {
        return sig;
    }

    public int getEl() {
        return el;
    }

    public void setAnt(DobleNodo ant) {
        this.ant = ant;
    }

    public void setSig(DobleNodo sig) {
        this.sig = sig;
    }

}
