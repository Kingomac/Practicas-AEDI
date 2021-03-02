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
public class Nodo {

    private Nodo sig;
    private Nodo ant;
    private int el;

    public Nodo(Nodo sig, Nodo ant, int el) {
        this.sig = sig;
        this.ant = ant;
        this.el = el;
    }

    public Nodo getSig() {
        return sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public int getEl() {
        return el;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public void setEl(int el) {
        this.el = el;
    }

}
