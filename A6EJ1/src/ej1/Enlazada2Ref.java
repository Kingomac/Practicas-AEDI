package ej1;

/**
 *
 * @author Mario
 * @param <T>
 */
public class Enlazada2Ref<T> implements Cola<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int numElem;

    public Enlazada2Ref() {
        primero = ultimo = null;
        numElem = 0;
    }

    @Override
    public int getNumElem() {
        return numElem;
    }

    @Override
    public boolean esVacio() {
        return primero == null;
    }

    @Override
    public T primero() throws ColaVaciaExcepcion {
        if (esVacio()) {
            throw new ColaVaciaExcepcion();
        }
        return primero.getEl();
    }

    @Override
    public T suprimir() throws ColaVaciaExcepcion {
        if (esVacio()) {
            throw new ColaVaciaExcepcion("No hay elemento a extraer");
        }
        T toret = primero.getEl();
        primero = primero.getSig();
        if (primero == null) {
            ultimo = null;
        }
        numElem--;
        return toret;
    }

    @Override
    public void insertar(T elemento) throws IllegalArgumentException {
        Nodo<T> nuevo = new Nodo<>(elemento, null);
        if (esVacio()) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
        }
        ultimo = nuevo;
        numElem++;
    }

}
