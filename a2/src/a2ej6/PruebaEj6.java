package a2ej6;

import java.util.Random;

/**
 *
 * @author Mario
 */
public class PruebaEj6 {

    public static void Main() {
        Random rand = new Random(System.nanoTime());
        final String[] nombre = new String[]{"juan", "ana", "brais", "pablo", "jose", "maría", "alberto", "lara", "manuel", "cristian"};
        ListaOrdenadaAlumnos lista = new ListaOrdenadaAlumnos();
        for (int i = 9; i > 0; i--) {
            lista.insertar(new Alumno(rand.nextInt(), nombre[i], rand.nextInt(500), rand.nextInt(4)));
        }
        System.out.println(lista.getOrdenadoPorMatricula());
    }
}
