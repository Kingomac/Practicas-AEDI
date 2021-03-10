/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2ej5;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazadaCentro {

    private DobleNodo central;
    private int numElemDer, numElemIzq;

    public DoblementeEnlazadaCentro() {
        central = null;
        numElemDer = 0;
        numElemIzq = 0;
    }

    public boolean esVacia() {
        return central == null;
    }

    public int numElementos() {
        return numElemDer + numElemIzq + 1;
    }

    public boolean esta(int el) {
        DobleNodo actual = central;
        if (actual == null) {
            return false;
        }
        if (actual.getEl() == el) {
            return true;
        }
        if (actual.getEl() < el) {
            while (actual != null && actual.getEl() < el) {
                actual = actual.getSig();
            }
        } else {
            while (actual != null && actual.getEl() > el) {
                actual = actual.getAnt();
            }
        }
        if (actual == null) {
            return false;
        } else {
            return actual.getEl() == el;
        }
    }

    public void insertar(int el) {

    }
}
