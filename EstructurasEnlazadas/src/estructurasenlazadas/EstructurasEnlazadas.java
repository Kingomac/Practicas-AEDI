package estructurasenlazadas;

import doble.DoblementeEnlazada;

/**
 *
 * @author Mario
 */
public class EstructurasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DoblementeEnlazadaOrdenada lista = new DoblementeEnlazadaOrdenada();
//        //Random rand = new Random(System.nanoTime());
//        for (int i = 10; i > 0; i--) {
//            lista.insertar(i);
//        }
//
//        System.out.println(lista);
//
//        System.out.println("Está 7: " + lista.esta(7));
//        lista.eliminar(5);
//        System.out.println(lista);

        DoblementeEnlazada<String> lista = new DoblementeEnlazada<>();
        lista.insertar("Hollywood");
        lista.insertar("infected");
        lista.insertar("your");
        lista.insertar("brain");
        System.out.println(lista);
        lista.eliminar("brain");
        System.out.println("Eliminar brain: " + lista);
    }

}
