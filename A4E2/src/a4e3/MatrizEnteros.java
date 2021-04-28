package a4e3;

/**
 * Nombre: Matriz de enteros Características: TAD que almacena los datos de una
 * matriz de enteros permitiendo insertar y recuperar valores
 */
public interface MatrizEnteros {
    //public MatrizEnteros(int n, int m);
    // Modifica this
    // Produce: crea una matriz n x m sin valores

    public void insertar(int i, int j, int v);
    // Modifica this
    // Produce: inserta el entero v en la fila i y columna j

    public int recuperar(int i, int j);
    // Produce: devuelve el valor en la fila i, columna j

    public int getNumFilas();
    // Produce: devuelve el número de filas de la matriz

    public int getNumColumnas();
    // Produce: devuelve el número de columnas de la matriz
}
