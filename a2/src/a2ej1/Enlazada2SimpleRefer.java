package a2ej1;

/**
 *
 * @author Mario
 */
public class Enlazada2SimpleRefer {

    private Nodo primero, ultimo;
    private int cont;

    /**
     * Crea una lista enlazada vacía
     */
    public Enlazada2SimpleRefer() {
        primero = ultimo = null;
        cont = 0;
    }

    /**
     *
     * @return Número de elementos de la lista
     */
    public int getCont() {
        return cont;
    }

    /**
     * Cuenta cuantas veces está un elemento usando un bucle while
     *
     * @param el
     * @return
     */
    public int numVecesA(int el) {
        Nodo actual = primero;
        int veces = 0;
        while (actual.getSig() != null) {
            if (actual.getEl() == el) {
                veces++;
            }
            actual = actual.getSig();
        }
        return veces;
    }

    /**
     * Cuenta cuantas veces está un elemento usando un bucle for
     *
     * @param el
     * @return
     */
    public int numVecesB(int el) {
        int veces = 0;
        for (Nodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                veces++;
            }
        }
        return veces;
    }

    /**
     * Comprueba si el elemento "el" está en la lista
     *
     * @param el
     * @return true si está sino false
     */
    public boolean esta(int el) {
        Nodo actual = primero;
        while (actual.getSig() != null && actual.getEl() != el) {
            actual = actual.getSig();
        }
        return actual != null;
    }

    /**
     * Inserta un nuevo nodo con el valor "el" al principio de la lista
     *
     * @param el valor a insertar
     */
    public void insertarPrimero(int el) {
        Nodo nuevo = new Nodo(el, primero);
        if (primero == null) {  // if(getCont() == 0)
            ultimo = nuevo;
        }
        primero = nuevo;
        cont++;
    }

    /**
     * Inserta un elemento al final de la lista
     *
     * @param el valor a insertar
     */
    public void insertarFinal(int el) {
        Nodo nuevo = new Nodo(el, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
        }
        ultimo = nuevo;
        cont++;
    }

    /**
     * Borra la primera ocurrencia del elemento buscado
     *
     * @param el elemento a buscar
     */
    public void borrar(int el) {
        if (primero == null) {
            System.out.println("Estructura vacía");
        } else if (primero.getEl() == el) {
            primero = primero.getSig();
            cont--;
        } else {
            Nodo actual = primero;
            while (actual.getSig() != null && actual.getSig().getEl() != el) {
                actual = actual.getSig();
            }
            if (actual.getSig() == null) {
                System.out.println("El elemento \"" + el + "\" no está en la lista");
            } else {
                actual.setSig(actual.getSig().getSig());
                cont--;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (Nodo actual = primero; actual.getSig() != null; actual = actual.getSig()) {
            toret.append(actual.getEl());
            toret.append(", ");
        }
        toret.append(ultimo.getEl());
        return toret.toString();
    }
}
