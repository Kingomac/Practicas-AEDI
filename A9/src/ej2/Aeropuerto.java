package ej2;

/**
 *
 * @author Mario
 */
public class Aeropuerto {

    private Pista[] pistas;

    public Aeropuerto(int numPistas) {
        pistas = new Pista[numPistas];
        for (int i = 0; i < numPistas; i++) {
            pistas[i] = new Pista(i + 1);
        }
    }

    public void asignarDestinoPista(int numPista, String destino) {
        pistas[numPista].asignarDestino(destino);
    }

    public void asignarVueloPista(Vuelo v) throws Exception {
        int menor = Integer.MAX_VALUE;
        int menorPista = -1;

        for (int i = 0; i < pistas.length; i++) {
            if (pistas[i].estaDestino(v.getDestino()) && pistas[i].getNumVuelosAsignados() < menor) {
                menor = pistas[i].getNumVuelosAsignados();
                menorPista = i;
            }
        }
        pistas[menorPista].asignarVuelo(v);

    }

    public Vuelo despegarVuelo(int numPista) {
        return pistas[numPista].eliminarVuelo();
    }

    public int getNumPistas() {
        return pistas.length;
    }

    public int getNumVuelosAsignados() {
        int toret = 0;
        for (Pista p : pistas) {
            toret += p.getNumVuelosAsignados();
        }
        return toret;
    }
}
