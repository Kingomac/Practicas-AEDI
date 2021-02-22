/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1ej7;

/**
 *
 * @author Mario
 *
 * Implementa un algoritmo que, dados dos arrays con 10 números reales, recorra
 * al mismo tiempo ambos arrays (elemento a elemento), uno en orden ascendente y
 * otro en orden descendente, sumando cada par de valores. Indica su complejidad
 * en Notación O.
 *
 */
public class A1ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int len = 10;
        double[] e1 = {3.45, 56.1, -4.4566456, 0, 6, 59.324, -12.456, 0.7665,
            77.756, 43.21};
        double[] e2 = {-22.5, 45.34, 6.45767647, 32.1, -345.45, -21.235, 43.234,
            29.34, -10.35, 91.32};
        for (int i = 0; i < len; i++) {
            e1[i] += e2[len - i - 1];
        }
    }

}
