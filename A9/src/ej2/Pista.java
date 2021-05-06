package ej2;

import ej1.TADTablaHash;
import ej1.TablaHashDinamica;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Mario
 */
public class Pista {

    private int numPista;
    private TADTablaHash<String> destinosAsociados;
    private Queue<Vuelo> vuelosEnEspera;

    public Pista(int numPista) {
        this.numPista = numPista;
        destinosAsociados = new TablaHashDinamica<>();
        vuelosEnEspera = new LinkedList<>();
    }

    public void asignarDestino(String destino) {
        destinosAsociados.insertar(destino);
    }

    public void asignarVuelo(Vuelo v) {
        vuelosEnEspera.add(v);
    }

    public Vuelo eliminarVuelo() {
        if (!vuelosEnEspera.isEmpty()) {
            return vuelosEnEspera.remove();
        }
        return null;
    }

    public int getNumPista() {
        return numPista;
    }

    public boolean estaDestino(String destino) {
        return destinosAsociados.buscar(destino);
    }

    public int getNumVuelosAsignados() {
        return vuelosEnEspera.size();
    }

}
