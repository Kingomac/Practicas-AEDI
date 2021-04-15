package ej1;

/**
 *
 * @author Mario
 */
public class ColaVaciaExcepcion extends RuntimeException {

    /**
     * Creates a new instance of <code>ColaVaciaExcepcion</code> without detail
     * message.
     */
    public ColaVaciaExcepcion() {
    }

    /**
     * Constructs an instance of <code>ColaVaciaExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ColaVaciaExcepcion(String msg) {
        super(msg);
    }
}
