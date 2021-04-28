package a4e3;

/**
 *
 * @author Mario
 */
public class MatrizEnterosArray implements MatrizEnteros {

    private int matriz[][];

    public MatrizEnterosArray(int numFilas, int numColumnas) {
        matriz = new int[numFilas][numColumnas];
    }

    @Override
    public void insertar(int i, int j, int v) {
        matriz[i][j] = v;
    }

    @Override
    public int recuperar(int i, int j) {
        return matriz[i][j];
    }

    @Override
    public int getNumFilas() {
        return matriz.length;
    }

    @Override
    public int getNumColumnas() {
        return matriz[0].length;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        for (int[] i : matriz) {
            for (int j : i) {
                toret.append(j).append(" ");
            }
            toret.append("\n");
        }
        return toret.toString();
    }

}
