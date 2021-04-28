package ej1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class Mano {

    private List<Carta> mano;

    public Mano() {
        mano = new LinkedList<Carta>();
    }

    public int getNumCartas() {
        return mano.size();
    }

    public void getCarta(Carta c) {
        mano.add(c);
    }

    public Carta jugarCarta(int pos) {
        return mano.remove(pos);
    }

    @Override
    public String toString() {
        int i = 1;
        StringBuilder toret = new StringBuilder();

        for (Carta c : mano) {
            toret.append("<").append(i).append(". ").append(c).append(">");
            i++;
        }

        return toret.toString();
    }
}
