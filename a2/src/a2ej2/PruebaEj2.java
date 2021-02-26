package a2ej2;

/**
 *
 * @author Mario
 */
public class PruebaEj2 {

    public static void Main() {
        final int a = 10;
        final int b = 10;
        DoblementeEnlazada lista = new DoblementeEnlazada();
        for (int i = 0; i < a; i++) {
            lista.insertarPrimero(i);
        }
        System.out.println(lista);
        System.out.println("Primero: " + lista.getPrimero());
        System.out.println("Último: " + lista.getUltimo());
        for (int i = 0; i < b; i++) {

            lista.insertarFinal(i);
        }
        System.out.println(lista);
        System.out.println("Primero: " + lista.getPrimero());
        System.out.println("Último: " + lista.getUltimo());
        lista.borrar(0);
        lista.borrar(-5);
        System.out.println("Borrar 0 y -5: " + lista);
        lista.borrar(9);
        System.out.println("Borrar 9: " + lista);
        System.out.println("Veces 2: " + lista.veces(2));
        System.out.println("Veces 4: " + lista.veces(4));
    }
}
