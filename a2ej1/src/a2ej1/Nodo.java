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
public class Nodo {

    private int elemento;
    private Nodo siguiente;

    public Nodo(int elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public void setEl(int v) {
        elemento = v;
    }

    public int getEl() {
        return elemento;
    }

    public void setSig(Nodo sig) {
        siguiente = sig;
    }

    public Nodo getSig() {
        return siguiente;
    }
}
