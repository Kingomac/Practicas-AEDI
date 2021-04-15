package ej1;

/**
 *
 * @author Mario
 * @param <E>
 */
public class EnlazadaCircular<E> implements Cola<E> {

    private Nodo<E> fin;
    private int numElem;

    public EnlazadaCircular() {
        fin = null;
        numElem = 0;
    }

    @Override
    public int getNumElem() {
        return numElem;
    }

    @Override
    public boolean esVacio() {
        return fin == null;
    }

    @Override
    public E primero() throws ColaVaciaExcepcion {
        if (esVacio()) {
            throw new ColaVaciaExcepcion();
        }
        return fin.getSig().getEl();
    }

    @Override
    public E suprimir() throws ColaVaciaExcepcion {
        if (esVacio()) {
            throw new ColaVaciaExcepcion("Error: la cola está vacía");
        }
        Nodo<E> n = fin.getSig();
        if (n == fin) {
            fin = null;
        } else {
            fin.setSig(n.getSig());
        }
        numElem--;
        return n.getEl();
    }

    @Override
    public void insertar(E elemento) throws IllegalArgumentException {
        Nodo<E> nuevo = new Nodo<>(elemento, null);
        if (esVacio()) {
            nuevo.setSig(nuevo);
        } else {
            nuevo.setSig(fin.getSig());
            fin.setSig(nuevo);
        }
        fin = nuevo;
        numElem++;
    }

}
