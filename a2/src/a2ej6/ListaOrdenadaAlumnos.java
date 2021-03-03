package a2ej6;

/**
 *
 * @author Mario
 */
public class ListaOrdenadaAlumnos {

    private Nodo primMatricula;
    private Nodo primNombre;

    public ListaOrdenadaAlumnos() {
        primMatricula = null;
        primNombre = null;
    }

    public void insertar(Alumno al) {
        if (primMatricula == null) {
            Nodo nuevo = new Nodo(al, null, null);
            primMatricula = nuevo;
            primNombre = nuevo;
        } else if (primMatricula.getSigMatricula() == null) {
            Nodo nuevo = new Nodo(al, null, null);
            if (primMatricula.getMatricula() > al.getMatricula()) {
                nuevo.setSigMatricula(primMatricula);
                primMatricula = nuevo;
            } else {
                primMatricula.setSigMatricula(nuevo);
            }

            if (primNombre.getNombre().compareToIgnoreCase(al.getNombre()) > al.getNombre().compareToIgnoreCase(primNombre.getNombre())) {
                nuevo.setSigNombre(primNombre);
                primNombre = nuevo;
            } else {
                primNombre.setSigNombre(nuevo);
            }
        } else {
            Nodo nuevo = new Nodo(al, null, null);
            // Añadir Nodo al orden de matrículas
            Nodo actual = primMatricula;
            while (actual.getSigMatricula() != null && actual.getMatricula() < al.getMatricula()) {
                actual = actual.getSigMatricula();
            }
            nuevo.setSigMatricula(actual.getSigMatricula());
            actual.setSigMatricula(nuevo);
            // Añadir Nodo al orden por nombres
            /*actual = primNombre;
            while (actual.getSigMatricula() != null && actual.getNombre().compareToIgnoreCase(al.getNombre()) < actual.getNombre().compareTo(actual.getSigNombre().getNombre())) {
                actual = actual.getSigNombre();
            }
            nuevo.setSigNombre(actual.getSigNombre());
            actual.setSigNombre(nuevo);*/
        }
    }

    public String getOrdenadoPorMatricula() {
        StringBuilder toret = new StringBuilder();
        Nodo actual = primMatricula;
        for (; actual.getSigMatricula() != null; actual = actual.getSigMatricula()) {
            toret.append(actual.getMatricula()).append(", ");
        }
        toret.append(actual.getMatricula());
        return toret.toString();
    }
}
