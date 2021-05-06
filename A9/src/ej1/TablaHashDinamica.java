package ej1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class TablaHashDinamica<E> implements TADTablaHash<E> {

    private int numElems;
    private int capacidad;
    private List<E>[] datos;

    public TablaHashDinamica(int capacidad) throws IllegalArgumentException {
        if (capacidad < 1) {
            throw new IllegalArgumentException();
        }
        numElems = 0;
        this.capacidad = capacidad;
        datos = new List[capacidad];
        for (int i = 0; i < capacidad; i++) {
            datos[i] = new LinkedList<>();
        }
    }

    public TablaHashDinamica() {
        this(50);
    }

    private int funcionHash(E clave) {
        return Math.abs(clave.hashCode()) % capacidad;
    }

    @Override
    public boolean insertar(E elem) {
        int indice = funcionHash(elem);

        if (datos[indice].contains(elem)) {
            return false;
        }
        datos[indice].add(elem);
        numElems++;
        return true;
    }

    @Override
    public boolean buscar(E elem) {
        int indice = funcionHash(elem);
        if (datos[indice].contains(elem)) {
            datos[indice].remove(elem);
            datos[indice].add(0, elem);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(E elem) {
        int indice = funcionHash(elem);
        if (datos[indice].contains(elem)) {
            datos[indice].remove(elem);
            numElems--;
            return true;
        }
        return false;
    }

    @Override
    public int tamanho() {
        return numElems;
    }

}
