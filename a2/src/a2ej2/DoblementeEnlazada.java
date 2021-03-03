package a2ej2;

/**
 *
 * @author Mario
 */
public class DoblementeEnlazada {

    private DobleNodo primero;
    private DobleNodo ultimo;
    private int cont;

    public DoblementeEnlazada() {
        primero = ultimo = null;
        cont = 0;
    }

    public boolean esVacia() {
        return primero == null; //cont == 0; ultimo == null;
    }

    public int numVeces(int el) {
        int veces = 0;
        for (DobleNodo actual = primero; actual != null; actual = actual.getSig()) {
            if (actual.getEl() == el) {
                veces++;
            }
        }
        return veces;
    }

    public boolean esta(int e) {
        DobleNodo actual = primero;
        while (actual != null && actual.getEl() != e) {
            actual = actual.getSig();
        }
        return actual != null;
    }

    public void insertarPrimero(int el) {
        DobleNodo nuevo = new DobleNodo(el, primero, null);
        if (esVacia()) {
            ultimo = nuevo;
        } else {
            primero.setAnt(nuevo);
        }
        primero = nuevo;
        cont++;
    }

    public void insertarFinal(int el) {
        DobleNodo nuevo = new DobleNodo(el, null, ultimo);
        if (esVacia()) {
            primero = nuevo;
        } else {
            ultimo.setSig(nuevo);
        }
        ultimo = nuevo;
        cont++;
    }

    public void borrar(int el) {
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            DobleNodo actual = primero;
            while (actual.getSig() != null && actual.getEl() != el) {
                actual = actual.getSig();
            }
            if (actual.getEl() == el) {
                if (actual == primero) {
                    primero = primero.getSig();
                    primero.setAnt(null);
                } else if (actual == ultimo) {
                    ultimo = ultimo.getAnt();
                    ultimo.setSig(null);
                } else {
                    actual.getAnt().setSig(actual.getSig());
                    actual.getSig().setAnt(actual.getAnt());
                }
                cont--;
            } else {
                System.out.println("El elemento \"" + el + "\" no está en la lista");
            }
        }
    }

    /*
        CASO 1: Lista vacía
        CASO 2: Hay un solo elemento y coincide el que se quiere borrar
        CASE 3: Hay más de un elemento y coincide el primero
        CASO 4: Hay más de un elmento y no coincide ninguno
        CASO 5: Hay más de un elemento y coincide el último
        CASO 6: Hay más de un elemento y coincide por el medio
     */
    public void borrar2(int e) {
        if (esVacia()) {
            System.out.println("Lista vacía");
        } else {
            if (primero == ultimo && primero.getEl() == e) {
                primero = ultimo = null;
                cont--;
            } else {
                if (primero.getEl() == e) {
                    primero.getSig().setAnt(null);
                    primero = primero.getSig();
                    cont--;
                } else {
                    DobleNodo actual = primero;
                    while (actual != null && actual.getEl() != e) {
                        actual = actual.getSig();
                    }
                    if (actual == null) {
                        System.out.println("El elemento no está en la lista");
                    } else {
                        if (actual == ultimo) {
                            ultimo.getAnt().setSig(null);
                            ultimo = ultimo.getAnt();
                        } else {
                            actual.getAnt().setSig(actual.getSig());
                            actual.getSig().setAnt(actual.getAnt());
                        }
                        cont--;
                    }
                }
            }
        }
    }

    public int getPrimero() {
        return primero.getEl();
    }

    public int getUltimo() {
        return ultimo.getEl();
    }

    public int getCont() {
        return cont;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder();
        DobleNodo actual = primero;
        while (actual.getSig() != null) {
            toret.append(actual.getEl());
            toret.append(", ");
            actual = actual.getSig();
        }
        toret.append(ultimo.getEl());
        return toret.toString();
    }
}
