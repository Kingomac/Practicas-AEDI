package a2ej6;

/**
 *
 * @author Mario
 */
public class Alumno {

    private int dni;
    private String nombre;
    private int numMatricula;
    private int curso;

    public Alumno(int dni, String nombre, int numMatricula, int curso) {
        this.dni = dni;
        this.nombre = nombre;
        this.numMatricula = numMatricula;
        this.curso = curso;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return numMatricula;
    }

    public int getCurso() {
        return curso;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

}
