package a5ej4;

import java.util.Stack;

/**
 *
 * @author Mario
 */
public class A5EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static <E> E desapilarElemento(Stack<E> p, int n) throws IllegalArgumentException {
        if (p.size() < n || n < 0) {
            throw new IllegalArgumentException("El elemento no está en la pila");
        }

        Stack<E> aux = new Stack();
        E toret;

        for (int i = 0; i < n - 1; i++) {
            aux.push(p.pop());
        }
        toret = p.pop();
        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }
        return toret;
    }

}
