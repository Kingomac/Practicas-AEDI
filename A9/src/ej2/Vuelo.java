package ej2;

import java.util.Calendar;

/**
 *
 * @author Mario
 */
public class Vuelo {

    private String avion;
    private String origen;
    private String destino;
    private Calendar diaHoraSalida;

    public Vuelo(String avion, String origen, String destino) {
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
        this.diaHoraSalida = Calendar.getInstance();
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Vuelo " + avion + " ----- " + origen + " - " + destino;
    }
}
