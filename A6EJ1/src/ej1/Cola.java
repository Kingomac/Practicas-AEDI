package ej1;

/**
 *
 * @author Mario
 * @param <E>
 */
public interface Cola<E> {

    public int getNumElem();

    public boolean esVacio();

    public E primero()
            throws ColaVaciaExcepcion;

    public E suprimir()
            throws ColaVaciaExcepcion;

    public void insertar(E elemento)
            throws IllegalArgumentException;
}
