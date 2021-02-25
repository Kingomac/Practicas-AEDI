package a2ej1;

/**
 *
 * @author Mario
 */
public class Nodo {

    private int elemento;
    private Nodo siguiente;

    /**
     * Crea una nodo
     *
     * @param elemento Valor a almacenar
     * @param siguiente Nodo al que referenciar como siguiente
     */
    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public void setEl(int v) {
        elemento = v;
    }

    public int getEl() {
        return elemento;
    }

    public void setSig(Nodo sig) {
        siguiente = sig;
    }

    public Nodo getSig() {
        return siguiente;
    }
}
