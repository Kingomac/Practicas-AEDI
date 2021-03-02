/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author Mario
 */
public class PruebaEj2 {

    public static void Main() {
        DoblementeEnlazadaCircularConCentinela lista = new DoblementeEnlazadaCircularConCentinela();
        final int a = 10;
        final int b = 10;

        for (int i = 0; i < a; i++) {
            lista.insertarFinal(i);
        }
        System.out.println(lista);
        for (int i = b; i > 0; i--) {
            lista.insertarPrimero(i);
        }
        System.out.println(lista);
        System.out.println("numVeces(0): " + lista.numVeces(0));
        System.out.println("numVeces(8): " + lista.numVeces(8));
        try {
            lista.borrar(8);
            System.out.println(lista);
        } catch (Exception exc) {
            System.out.println("Error borrando de la lista: " + exc.getMessage());
        }
    }
}
