package a2ej3;

/**
 *
 * @author Mario
 */
import a2ej1.Nodo;

public class EnlazadaCircular {

    private Nodo fin;

    public EnlazadaCircular() {
        fin = null;
    }

    public int veces(int el) {
        int veces = 0;
        Nodo actual = fin;
        while (actual.getSig() != fin) {
            if (actual.getEl() == el) {
                veces++;
            }
            actual = actual.getSig();
        }
        return veces;
    }

}
