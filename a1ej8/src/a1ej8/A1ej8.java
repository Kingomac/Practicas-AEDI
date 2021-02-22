/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1ej8;

import java.util.Random;

/**
 *
 * @author Mario
 *
 * Implementa un algoritmo que sume dos matrices cuadradas. Indica su
 * complejidad en Notación O.
 *
 */
public class A1ej8 {

    /**
     * @param args the command line arguments
     */
    // O(n^2)
    public static void main(String[] args) {
        int len = 4;
        int[][] m1 = matrizAleatoria(len);
        int[][] m2 = matrizAleatoria(len);
        for (int i = 0; i < len; i++) { // O(n)
            for (int j = 0; j < len; j++) {  // O(n)
                m1[i][j] += m2[i][j]; // O(1)
            }

        }
    }

    public static int[][] matrizAleatoria(int n) {
        int[][] r = new int[n][n];
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = random.nextInt(100);
            }
        }
        return r;
    }
}
