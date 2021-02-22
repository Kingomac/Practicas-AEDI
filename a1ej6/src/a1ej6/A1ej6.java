/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1ej6;

/**
 *
 * @author Mario
 *
 * Escribe un algoritmo que, dado un array y un índice, determine si dicho
 * índice es una posición válida, es decir, si está entre los límites de dicho
 * array. Si es una posición válida, debes eliminar dicho elemento del array,
 * desplazando todos los demás elementos. Indica su complejidad en Notación O.
 *
 */
public class A1ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {5, 3, 76, 23, -5, 54, 6};
        int borrar = 4;
        mostrarArray(array);
        if (borrar > -1 && borrar < array.length) { // O(1)
            for (int i = borrar; i < array.length - 1; i++) { // O(n)
                array[i] = array[i + 1];
            }
        }
        mostrarArray(array);
    }

    public static void mostrarArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

}
