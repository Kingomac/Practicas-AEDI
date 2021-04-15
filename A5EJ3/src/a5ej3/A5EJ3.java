package a5ej3;

import java.util.Stack;

/**
 *
 * @author Mario
 */
public class A5EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(codificar("Bond, James Bond"));
    }

    public static String codificar(String mensaje) {
        final String vocales = "aeiou";
        Stack<Character> pila = new Stack<>();
        StringBuilder toret = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            if (vocales.contains(String.valueOf(mensaje.charAt(i)).toLowerCase())) {
                while (!pila.isEmpty()) {
                    toret.append(pila.pop());
                }
                toret.append(mensaje.charAt(i));
            } else {
                pila.push(mensaje.charAt(i));
            }
        }
        while (!pila.isEmpty()) {
            toret.append(pila.pop());
        }
        return toret.toString();
    }

    public static String codificar2(String mensaje) {
        Stack<Character> pila = new Stack<>();
        String toret = "";

        for (int i = 0; i < mensaje.length(); i++) {
            switch (mensaje.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    while (!pila.isEmpty()) {
                        toret += pila.pop();
                    }
                    toret += mensaje.charAt(i);
                    break;
                default:
                    pila.push(mensaje.charAt(i));
            }
        }
        while (!pila.isEmpty()) {
            toret += pila.pop();
        }
        return toret;
    }

}
