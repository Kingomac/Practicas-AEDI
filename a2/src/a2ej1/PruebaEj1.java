package a2ej1;

/**
 *
 * @author Mario
 */
public class PruebaEj1 {

    public static void Main() {
        int a = 15;
        int b = 5;
        Enlazada2SimpleRefer lista = new Enlazada2SimpleRefer();
        for (int i = 0; i < a; i++) {
            lista.insertarPrimero(i);
        }
        System.out.println(lista + " | cont:" + lista.getCont());

        for (int i = 0; i < b; i++) {
            lista.insertarFinal(i);
        }
        System.out.println(lista + " | cont:" + lista.getCont());
        lista.borrar(0);
        lista.borrar(7);
        lista.borrar(-5);
        System.out.println("Borrar 0, 7 y -5: " + lista + " | cont:" + lista.getCont());
        System.out.println("Está en la lista 5: " + lista.esta(5));
        System.out.println("Está en la lista 2: " + lista.esta(2));
        System.out.println("Está en la lista -22: " + lista.esta(-22));
        System.out.println("Veces que está 3: " + lista.numVecesA(3));
        System.out.println("Veces que está 1: " + lista.numVecesA(1));
        System.out.println("Veces que está -5: " + lista.numVecesB(-5));
    }
}
