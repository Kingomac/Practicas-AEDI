package a2ej4;

/**
 *
 * @author Mario
 */
public class PruebaEj4 {

    public static void Main() {
        DoblementeEnlazadaCircular lista = new DoblementeEnlazadaCircular();
        final int a = 10;
        for (int i = 0; i < a; i++) {
            lista.insertarFinal(i);
            lista.insertarFinal(a - i);
        }
        System.out.println(lista);
        lista.borrarPrimero();
        lista.borrarPrimero();
        System.out.println("Borrar primero 2 veces: " + lista);
        System.out.println("Veces que aparece 0: " + lista.numVeces(0));
        System.out.println("Veces que aparece 9: " + lista.numVeces(9));
        System.out.println("Veces que aparece 1: " + lista.numVeces(1));
        System.out.println("Número de elementos: " + lista.getCont());
    }
}
