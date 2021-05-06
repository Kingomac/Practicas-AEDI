package ej1;

/**
 *
 * @author Mario
 * @param <E>
 */
public interface TADTablaHash<E> {

    public boolean insertar(E elem);
// Modifica: This
// Produce: Si el elemento ya está devuelve “false”, sino lo inserta y devuelve “true”.

    public boolean buscar(E elem);
// Produce: Si no está el elemento se devuelve “false”; si está dicho elemento se realiza un movimiento al frente (es decir, se coloca al principio de la estructura) y se devuelve “true”.

    public boolean eliminar(E elem);
// Modifica: This
// Produce: Si no está el elemento se devuelve “false”; si está se elimina y se devuelve “true”.

    public int tamanho();
// Produce: Devuelve el número de elementos de la tabla hash.
}
