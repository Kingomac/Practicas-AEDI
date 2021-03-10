package ej3;

import java.util.Random;

/**
 *
 * @author Mario
 */
public class PruebaEj3 {

    public static void main() {
        OrdenadaEnlazadaCentinela lista = new OrdenadaEnlazadaCentinela();
        Random random = new Random(System.nanoTime());
        for (int i = 0; i <= 5; i++) {
            lista.insertar(random.nextInt(20));
        }
        System.out.println("El elemento 15 está? " + lista.esta(15));
        System.out.println("El elemento 5 está? " + lista.esta(5));
        System.out.println("Insertar el elemento 12");
        lista.insertar(12);
        System.out.println("El elemento 12 está? " + lista.esta(12));
        System.out.println("Eliminar el elemento 12");
        lista.borrar(12);
        System.out.println("El elemento 12 está? " + lista.esta(12));
        System.out.println("Lista: " + lista);
    }
}
