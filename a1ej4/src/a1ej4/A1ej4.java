package a1ej4;

import java.util.Random;

/**
 *
 * @author Mario
 *
 * Escribe un algoritmo que dado un array de enteros, muestre por pantalla los
 * enteros impares. Indica su complejidad en Notación O
 *
 */
public class A1ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // O(n)
        int[] entrada = enterosAleatorios(20);
        for (int i : entrada) { // O(n)
            if (i % 2 != 0) { // O(1)
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }

    public static int[] enterosAleatorios(int n) {
        int[] r = new int[n];
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < r.length; i++) {
            r[i] = random.nextInt(100);
        }
        return r;
    }

}
