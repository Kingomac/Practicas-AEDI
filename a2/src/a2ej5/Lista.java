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
public class Lista {

    private Nodo centro;
    private int cont;

    public Lista() {
        centro = null;
        cont = 0;
    }

    public void insertarFinal(int el) {
        if (centro == null) {
            centro = new Nodo(null, null, el);
        } else {
            Nodo nuevo = new Nodo(null, null, el);
            Nodo actual = centro;
            while (actual.getSig() != null) {
                actual = actual.getSig();
            }
            nuevo.setAnt(actual);
            actual.setSig(nuevo);
            cont++;
        }
    }
}
