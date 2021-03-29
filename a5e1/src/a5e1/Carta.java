package a5e1;

/**
 *
 * @author Mario
 */
public class Carta {

    private final String nombre;

    public Carta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "[" + nombre + "]";
    }

}
