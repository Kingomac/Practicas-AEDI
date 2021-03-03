package a2ej6;

/**
 *
 * @author Mario
 */
public class Nodo {

    private Alumno alumno;
    private Nodo sigMatricula;
    private Nodo sigNombre;

    public Nodo(Alumno alumno, Nodo sigMatricula, Nodo sigNombre) {
        this.alumno = alumno;
        this.sigMatricula = sigMatricula;
        this.sigNombre = sigNombre;
    }

    public Nodo getSigMatricula() {
        return sigMatricula;
    }

    public Nodo getSigNombre() {
        return sigNombre;
    }

    public void setSigMatricula(Nodo sigMatricula) {
        this.sigMatricula = sigMatricula;
    }

    public void setSigNombre(Nodo sigNombre) {
        this.sigNombre = sigNombre;
    }

    public String getNombre() {
        return alumno.getNombre();
    }

    public int getMatricula() {
        return alumno.getMatricula();
    }
}
