package a5ej2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mario
 */
public class A5EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (validaParentesisVictorEdition(scan.nextLine())) {
            System.out.println("Paréntesis correctos");
        } else {
            System.out.println("Paréntesis incorrectos");
        }
    }

    private static boolean validaParentesis(String expresion) {
        final String apertura = "{[(";
        final String cierre = ")]}";
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i >= 0; i--) {
            if (apertura.contains(String.valueOf(expresion.charAt(i)))) {
                pila.push(expresion.charAt(i));
            } else if (cierre.contains(String.valueOf(expresion.charAt(i)))) {
                if (!pila.pop().equals(expresion.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validaParentesisVictorEdition(String expr) {
        Stack<Character> pila = new Stack<>();
        boolean parentesisCorrecto = true;
        for (int i = 0; i < expr.length() && parentesisCorrecto; i++) {
            switch (expr.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    pila.push(expr.charAt(i));
                    break;
                case ')':
                    if (!pila.isEmpty() || pila.pop() != '{') {
                        parentesisCorrecto = false;
                    }
                case ']':
                    if (!pila.isEmpty() || pila.pop() != '[') {
                        parentesisCorrecto = false;
                    }
                case '}':
                    if (!pila.isEmpty() || pila.pop() != '{') {
                        parentesisCorrecto = false;
                    }
            }
        }
        return parentesisCorrecto && pila.isEmpty();
    }
}
