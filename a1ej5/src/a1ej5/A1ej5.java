package a1ej5;

/**
 *
 * @author Mario
 *
 * Escribe un algoritmo que dado un array de enteros, busque un elemento. Si
 * está, debes visualizar su posición en el array y si no está debes mostrar un
 * mensaje aclaratorio. Si el elemento está repetido, muestra la posición de su
 * primera aparición. Indica su complejidad en Notación O
 *
 */
public class A1ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] entrada = {5, 4, 56, 78, 23, 56, -4};
        int buscar = 78;
        int i = 0;
        while (i < entrada.length && entrada[i] != buscar) {  // O(n)
            i++;
        }
        if (i < entrada.length) {
            System.out.println("El elemento no está en la lista");
        } else {
            System.out.println("El elemento está en la posición: " + i);
        }
    }

}
