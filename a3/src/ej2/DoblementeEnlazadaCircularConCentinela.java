/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import ej1.DobleNodo;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazadaCircularConCentinela {

    private DobleNodo fin;
    private int cont;

    public DoblementeEnlazadaCircularConCentinela() {
        fin = new DobleNodo(-0, null, null);
        fin.setAnt(fin);
        fin.setSig(fin);
    }

    public int getCont() {
        return cont;
    }

    public int numVeces(int el) {
        int toret = 0;
        for (DobleNodo actual = fin.getSig(); actual != fin; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                toret++;
            }
        }
        return toret;
    }

    public void insertarPrimero(int el) {
        DobleNodo nuevo = new DobleNodo(el, fin.getSig(), fin);
        fin.getSig().setAnt(nuevo);
        fin.setSig(nuevo);
    }

    public void insertarFinal(int el) {
        DobleNodo nuevo = new DobleNodo(el, fin, fin.getAnt());
        fin.getAnt().setSig(nuevo);
        fin.setAnt(nuevo);
    }

    public void borrar(int el) throws Exception {
        DobleNodo actual = fin.getSig();
        while (actual != fin && actual.getEl() != el) {
            actual = actual.getSig();
        }
        if (actual == fin) {
            throw new Exception("El elemento a borrar \"" + el + "\" no está en la lista");
        }
        actual.getAnt().setSig(actual.getSig());
        actual.getSig().setAnt(actual.getAnt());
    }

    @Override
    public String toString() {
        if (fin.getSig() == fin) {
            return "Lista vacía";
        }
        StringBuilder toret = new StringBuilder();
        for (DobleNodo actual = fin.getSig(); actual != fin.getAnt(); actual = actual.getSig()) {
            toret.append(actual.getEl()).append(", ");
        }
        toret.append(fin.getAnt().getEl());
        return toret.toString();
    }

}
