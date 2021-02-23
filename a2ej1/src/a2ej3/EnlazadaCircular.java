package a2ej3;

/**
 *
 * @author Mario
 */
import a2ej1.Nodo; // Importar nodo simple del ejercicio 1

public class EnlazadaCircular {

    private Nodo fin;

    public EnlazadaCircular() {
        fin = null;
    }

    public int veces(int el) {
        int veces = 0;
        Nodo actual = fin;
        while (actual.getSig() != fin) {
            if (actual.getEl() == el) {
                veces++;
            }
            actual = actual.getSig();
        }
        return veces;
    }

    public int getPrimero() {
        return fin.getSig().getEl();
    }

    public void insertarFinal(int el) {
        Nodo nuevo = new Nodo(el, null);
        if (fin == null) {
            nuevo.setSig(nuevo);
        } else {
            nuevo.setSig(fin.getSig());
            fin.setSig(nuevo);
        }
        fin = nuevo;
    }

    public void borrarPrimero() {
        if (fin == null) {
            System.out.println("Lista vacía");
        } else {
            fin.setSig(fin.getSig().getSig());
        }
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        Nodo actual = fin.getSig();
        while (actual != fin) {
            toret.append(actual.getEl());
            toret.append(", ");
            actual = actual.getSig();
        }
        toret.append(fin.getEl());
        return toret.toString();
    }

}
