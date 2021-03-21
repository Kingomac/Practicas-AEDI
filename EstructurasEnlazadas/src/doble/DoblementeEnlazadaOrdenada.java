package doble;

import java.text.DecimalFormat;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazadaOrdenada {

    private final DobleNodo<Double> ultimo;
    private final DobleNodo<Double> primero;
    private int cont;

    public DoblementeEnlazadaOrdenada() {
        primero = new DobleNodo<>(Double.MIN_VALUE, null, null);
        ultimo = new DobleNodo<>(Double.MAX_VALUE, primero, null);
        primero.setSig(ultimo);
    }

    public void insertar(double el) {
        DobleNodo<Double> actual = primero;
        DobleNodo<Double> nuevo = new DobleNodo<>(el, null, null);
        while (actual != ultimo && actual.getSig().getEl() < el) {
            actual = actual.getSig();
        }
        nuevo.setAnt(actual);
        nuevo.setSig(actual.getSig());
        actual.getSig().setAnt(nuevo);
        actual.setSig(nuevo);
        cont++;
    }

    public boolean eliminar(double el) {
        DobleNodo<Double> actual = primero.getSig();
        while (actual != ultimo && actual.getEl() < el) {
            actual = actual.getSig();
        }
        if (actual.getEl() == el) {
            actual.getAnt().setSig(actual.getSig());
            actual.getSig().setAnt(actual.getAnt());
            return true;
        }
        return false;
    }

    public boolean esta(double el) {
        for (DobleNodo<Double> actual = primero.getSig(); actual.getEl() <= el; actual = actual.getSig()) {
            if (actual.getEl().equals(el)) {
                return true;
            }
        }
        return false;
    }

    public int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        DecimalFormat format = new DecimalFormat("0.##");
        for (DobleNodo<Double> actual = primero.getSig(); actual.getSig() != ultimo; actual = actual.getSig()) {
            toret.append(format.format(actual.getEl())).append(", ");
        }
        toret.append(format.format(ultimo.getAnt().getEl()));
        return toret.toString();
    }
}
