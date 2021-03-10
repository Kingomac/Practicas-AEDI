/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Mario
 */
public class Nodo {

    private Nodo sig;
    private final int el;

    public Nodo(int el, Nodo sig) {
        this.el = el;
        this.sig = sig;
    }

    public Nodo getSig() {
        return sig;
    }

    public int getEl() {
        return el;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
