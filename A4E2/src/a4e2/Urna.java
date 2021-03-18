package a4e2;

/**
 *
 * @author Mario
 */
public interface Urna<E> {

    /*
    * Declaración de tipos: Urna, E, int, boolean
    * Características: Una urna es una colección de elementos no ordenados en la
    que se pueden insertar, recuperar o eliminar elementos de uno en uno.
    También se puede volcar el contenido de un elmento de una urna en otra.
    Los objetos son modificables.
     */

    public Urna ();
    // Produce: crea una urna vacía

    public void insertar(E elemento);
    // Modifica: modifica this
    // Produce: añade el elemento "elemento" a la urna

    public void insertarUrna(Urna<E> urna) throws NullPointerException;

    // Modifica: modifica this
    /* Produce: si la urna "u" que se pasa como parámetro no existe, lanza la
    excepción NullPointerException. En otro caso, inserta el contenido de la
    urna "u" en this */

    public boolean eliminar(E elemento);

    // Modifica: modifica this
    /* Produce: si el elemento está en this elimina una ocurrencia y devuelve
    true. Si el elemento no está en this devuelve false */

    public E recuperar() throws UrnaVaciaExcepcion;

    /* Produce: si la urna está vacía lanza la excepción UrnaVaciaExcepcion. En
    otro caso, devuelve un elemento cualquiera de this */

    public int tamanho();
    // Produce: devuelve el número de elementos que hay en this
}
