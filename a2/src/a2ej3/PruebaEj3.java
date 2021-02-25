/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2ej3;

/**
 *
 * @author Mario
 */
public class PruebaEj3 {

    public static void Main() {
        int a = 10;

        EnlazadaCircular lista = new EnlazadaCircular();
        for (int i = 0; i < a; i++) {
            lista.insertarFinal(i);
        }
        for (; a > 0; a--) {
            lista.insertarFinal(a);
        }
        System.out.println(lista);

        System.out.println("Veces 0: " + lista.veces(0));
        System.out.println("Veces 3: " + lista.veces(3));
        lista.borrarPrimero();
        System.out.println("Borrar primero: " + lista);
        lista.borrarPrimero();
        System.out.println("Borrar primero: " + lista);
    }
}
