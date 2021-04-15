package a5ej5;

import java.util.Stack;

/**
 *
 * @author Mario
 */
public class A5EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(binario(7));
    }

    public static String binario(int dec) {
        StringBuilder toret = new StringBuilder();
        Stack<Integer> pila = new Stack();
        while (dec > 0) {
            pila.push(dec % 2);
            dec /= 2;
        }
        while (!pila.isEmpty()) {
            toret.append(pila.pop());
        }
        return toret.toString();
    }
}
