package a4e3;

class A4E3 {

    public static void main(String[] args) {
        MatrizEnteros m1 = new MatrizEnterosArray(2, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.insertar(i, j, 2);
            }
        }
        MatrizEnteros m2 = new MatrizEnterosArray(2, 2);
        m2.insertar(0, 0, 1);
        m2.insertar(1, 1, 1);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(producto(m1, m2));
    }

    private static MatrizEnteros producto(MatrizEnteros a, MatrizEnteros b) {
        MatrizEnteros toret = new MatrizEnterosArray(a.getNumFilas(), b.getNumColumnas());
        for (int i = 0; i < toret.getNumFilas(); i++) {
            for (int j = 0; j < a.getNumColumnas(); j++) {
                for (int k = 0; k < b.getNumFilas(); k++) {
                    toret.insertar(i, j, a.recuperar(i, k) * b.recuperar(k, j) + toret.recuperar(i, j));
                }
            }
        }
        return toret;
    }
}
