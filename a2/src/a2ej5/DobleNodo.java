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
public class DobleNodo {

    private DobleNodo sig;
    private DobleNodo ant;
    private int el;

    public DobleNodo(DobleNodo sig, DobleNodo ant, int el) {
        this.sig = sig;
        this.ant = ant;
        this.el = el;
    }

    public DobleNodo getSig() {
        return sig;
    }

    public DobleNodo getAnt() {
        return ant;
    }

    public int getEl() {
        return el;
    }

    public void setSig(DobleNodo sig) {
        this.sig = sig;
    }

    public void setAnt(DobleNodo ant) {
        this.ant = ant;
    }

    public void setEl(int el) {
        this.el = el;
    }

}
