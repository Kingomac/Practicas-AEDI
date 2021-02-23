/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2ej1;

/**
 *
 * @author Mario
 */
public class Enlazada2SimpleRefer {

    private Nodo primero, ultimo;
    private int cont;

    public Enlazada2SimpleRefer() {
        primero = ultimo = null;
        cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public int vecesEsta(int el) {
        Nodo actual = primero;
        int cont = 0;
        while (actual.getSig() != null) {
            if (actual.getEl() == el) {
                cont++;
            }
            actual = actual.getSig();
        }
        return cont;
    }

    public boolean esta(int el) {
        Nodo actual = primero;
        while (actual.getSig() != null && actual.getEl() != el) {
            actual = actual.getSig();
        }
        if (actual == ultimo) {
            return false;
        } else {
            return true;
        }
    }

    public void insertarPrimero(int el) {

        /*if (primero == null) {
            Nodo nuevo = new Nodo(el, null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Nodo nuevo = new Nodo(el, primero);
            primero = nuevo;
            System.out.println("Nuevo nodo: " + this);
        }*/
        Nodo nuevo = new Nodo(el, primero);
        if (primero == null) {
            ultimo = nuevo;
        }
        primero = nuevo;
        cont++;
    }

    public void insertarFinal(int el) {
        if (primero == null) {
            primero = new Nodo(el, null);
            ultimo = primero;
        } else {
            Nodo nuevo = new Nodo(el, null);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
        cont++;
    }

    public void borrar(int el) {
        if (primero == null) {
            System.out.println("Estructura vacía");
        } else {
            Nodo actual = primero;
            while (actual.getSig() != null && actual.getSig().getEl() != el) {
                actual = actual.getSig();
            }
            if (actual == ultimo) {
                System.out.println("El elemento " + el + " no está en la lista"
                );
            } else if (actual == primero) {
                primero = primero.getSig();
                cont--;
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
