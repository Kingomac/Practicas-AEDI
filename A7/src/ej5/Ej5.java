package ej5;

import cola.*;
import java.util.List;

/**
 *
 * @author Mario
 */
public class Ej5 {

    public static void main(String[] args) {

    }

    public static double duracionTotal(Cola<CD> cargador) {
        double duracion = 0;

        while (!cargador.esVacio()) {
            CD cd = cargador.suprimir();
            List<Cancion> canciones = cd.getCanciones();
            for (Cancion c : canciones) {
                duracion += c.getDuracion();
            }
        }

        return duracion;
    }
}
