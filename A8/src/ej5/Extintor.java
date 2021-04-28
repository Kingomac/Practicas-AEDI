package ej5;

/**
 *
 * @author Mario
 */
public class Extintor {

    private int numReferencia;
    private char tipo;
    private double precio;
    private String fechaTimbrado;

    public Extintor(int n, char t, double p, String f) {
        numReferencia = n;
        tipo = t;
        precio = p;
        fechaTimbrado = f;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public char getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaTimbrado() {
        return fechaTimbrado;
    }
}
