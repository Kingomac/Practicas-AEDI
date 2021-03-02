/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazadaCentinelas {

    private DobleNodo primero;
    private DobleNodo ultimo;
    private int cont;

    public DoblementeEnlazadaCentinelas() {
        this.primero = new DobleNodo(-0, null, null);
        this.ultimo = new DobleNodo(-0, null, primero);
        this.primero.setSig(ultimo);
    }

    public int getCont() {
        return cont;
    }

    public int numVeces(int el) {
        int toret = 0;
        for (DobleNodo actual = primero.getSig(); actual != ultimo; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                toret++;
            }
        }
        return toret;
    }

    public boolean esta(int el) {
        for (DobleNodo actual = primero.getSig(); actual != ultimo; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                return true;
            }
        }
        return false;
    }

    public void insertarPrimero(int el) {
        DobleNodo nuevo = new DobleNodo(el, primero.getSig(), primero);
        primero.getSig().setAnt(nuevo);
        primero.setSig(nuevo);
        cont++;
    }

    public void insertarFinal(int el) {
        DobleNodo nuevo = new DobleNodo(el, ultimo, ultimo.getAnt());
        ultimo.getAnt().setSig(nuevo);
        ultimo.setAnt(nuevo);
        cont++;
    }

    public void borrar(int el) throws Exception {
        DobleNodo actual = primero.getSig();
        while (actual != ultimo && actual.getEl() != el) {
            actual = actual.getSig();
        }
        if (actual == ultimo) {
            throw new Exception("El elemento a borrar \"" + el + "\" no está en la lista");
        }
        actual.getAnt().setSig(actual.getSig());
        actual.getSig().setAnt(actual.getAnt());
        cont--;
    }

    @Override
    public String toString() {
        if (primero.getSig() == ultimo) {
            return "Lista vacía";
        }
        StringBuilder toret = new StringBuilder();
        for (DobleNodo actual = primero.getSig(); actual.getSig() != ultimo; actual = actual.getSig()) {
            toret.append(actual.getEl()).append(", ");
        }
        toret.append(ultimo.getAnt().getEl());
        return toret.toString();
    }

}
