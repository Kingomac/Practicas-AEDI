package ej3;

/**
 *
 * @author Mario
 */
public class Ej3 {

    /**
     *
     * @param aux matriz
     * @param x fila
     * @param y columna
     * @param nuevoColor nuevo color
     */
    public static void rellenar(int[][] aux, int x, int y, int nuevoColor) {
        final int nfilas = aux.length;
        final int ncols = aux[0].length;
        if (x < 0 || x > nfilas - 1 || y < 0 || y > ncols - 1) {
            System.err.println("Error: coordenadas no válidas");
        } else {
            int posX = x;
            int posY = y;
            final int colorAntiguo = aux[x][y];
            while (posY < ncols && aux[posX][posY] == colorAntiguo) {
                aux[posX][posY++] = nuevoColor;
            }

            posY = y - 1;

            while (posY >= 0 && aux[posX][posY] == colorAntiguo) {
                aux[posX][posY--] = nuevoColor;
            }

            posY = y;
            posX = x - 1;

            while (posX >= 0 && aux[posX][posY] == colorAntiguo) {
                aux[posX--][posY] = nuevoColor;
            }

            posX = x + 1;

            while (posX < nfilas && aux[posX][posY] == colorAntiguo) {
                aux[posX++][posY] = nuevoColor;
            }
        }
    }
}
