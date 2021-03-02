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
public class PruebaEj1 {

    public static void Main() {
        DoblementeEnlazadaCentinelas lista = new DoblementeEnlazadaCentinelas();
        final int a = 10;
        final int b = 10;
        /*for (int i = 0; i < a; i++) {
            lista.insertarFinal(i);
        }*/
        System.out.println(lista);
        for (int i = b; i >= 0; i--) {
            lista.insertarPrimero(i);
        }
        System.out.println(lista);
        System.out.println("esta(0): " + lista.esta(5));
        System.out.println("esta(-2): " + lista.esta(-2));
        System.out.println("numVeces(9): " + lista.numVeces(9));
        try {
            lista.borrar(0);
            lista.borrar(9);
            System.out.println("Elementos 0 y 9 borrados");
        } catch (Exception exc) {
            System.out.println("Error borrando elementos de la lista: " + exc.getMessage());
        }
        System.out.println(lista);
    }
}
