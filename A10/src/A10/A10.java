package A10;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Mario
 */
public class A10 {

    /**
     * Ej 1
     *
     * @param aux
     */
    public static void ordenacionBurbuja2Direc(int[] aux) {
        int pasadasTotal = (aux.length - 1) / 2;

        for (int actual = 0; actual < pasadasTotal; actual++) {
            for (int i = actual; i < pasadasTotal - 1; i++) {
                if (aux[i] > aux[i + 1]) {
                    int temp = aux[i];
                    aux[i] = aux[i + 1];
                    aux[i + 1] = temp;
                }
            }
            for (int i = pasadasTotal - actual - 2; i > actual + 1; i--) {
                if (aux[i] < aux[i - 1]) {
                    int temp = aux[i];
                    aux[i] = aux[i - 1];
                    aux[i - 1] = temp;
                }
            }
        }
    }

// Ej 2
    private static int indice(int numero, int pasada) {
//Produce:  el  dígito  de  número,  que  está  en  la  posición  pasada.  Para  un  numero  de  tres  dígitos,  pasada tomará los valores 0, 1 y 2, devolviendo las unidades, decenas o centenas respectivamente.
        return (numero / ((int) Math.pow(10, pasada))) % 10;
    }

    public static void ordenacionRaiz(int[] numeros) {
        Queue<Integer>[] colas = new Queue[10];
        for (int i = 0; i < colas.length; i++) {
            colas[i] = new LinkedList<>();
        }

        for (int pasada = 0; pasada < 3; pasada++) {
            for (int i = 0; i < numeros.length; i++) {
                int ind = indice(numeros[i], pasada);
                colas[ind].add(numeros[i]);
            }
        }

        int posArray = 0;
        for (int i = 0; i < colas.length; i++) {
            while (!colas[i].isEmpty()) {
                numeros[posArray++] = colas[i].remove();
            }
        }

    }

//Ej 3
    public static void ordSeleccion(int[] aux) {
        for (int i = 0; i < aux.length - 1; i++) {
            int posMayor = mayor(aux, i, aux.length);
            if (i != posMayor) {
                int temp = aux[i];
                aux[i] = aux[posMayor];
                aux[posMayor] = temp;
            }
        }
        if (aux[aux.length - 2] < aux[aux.length - 1]) {
            int temp = aux[aux.length - 2];
            aux[aux.length - 2] = aux[aux.length - 1];
            aux[aux.length - 1] = temp;
        }
    }

    private static int mayor(int[] aux, int inicio, int fin) {
        int mayor = inicio;
        for (int i = inicio + 1; i < fin; i++) {
            if (aux[i] > aux[mayor]) {
                mayor = i;
            }
        }
        return mayor;
    }

    // Ej 4
    public static void ordenarConteoDec(int[] aux) {
        int[] cont = new int[aux.length];
        int[] aux2 = new int[aux.length];
        for (int i = 0; i < aux.length; i++) {
            cont[i] = 0;
            for (int j = 0; j < aux.length; j++) {
                if (aux[j] > aux[i]) {
                    cont[i]++;
                }
            }
            aux2[cont[i]] = aux[i];
        }

        for (int i = 0; i < aux.length; i++) {
            aux[i] = aux2[i];
        }
    }

    // Ej 5
    public static void ordShell(int[] aux) {
        int intervalo = aux.length / 2;
        while (intervalo > 0) {
            for (int i = intervalo; i < aux.length; i++) {
                int elem = aux[i];
                int j = i - intervalo;
                while (j > -1 && elem > aux[j]) {
                    aux[j + intervalo] = aux[j];
                    j -= intervalo;
                }

                aux[j + intervalo] = elem;
            }

            intervalo /= 2;
        }
    }

    // Ej 6 Quicksort
    private static int buscaPivote(int[] aux, int inicio, int fin) {
        int primer = aux[inicio];
        int k = inicio + 1;
        while (k <= fin) {
            if (aux[k] > primer) {
                return k;
            } else if (aux[k] < primer) {
                return inicio;
            } else {
                k++;
            }
        }
//Si llega al final del array y todos los elementos son iguales, o si sólo hay un elemento
        return -1;
    }

    private static int particion(int[] aux, int inicio, int fin, int pivote) {
        int derecha = inicio;
        int izquierda = fin - 1;
// pivote está en la última posición
        do {
            while (aux[derecha] < pivote) {
                derecha++;
            }
            while (aux[izquierda] >= pivote) {
                izquierda--;
            }
// intercambia los valores de las posiciones derecha e izquierda
            if (derecha < izquierda) {
                intercambiar(aux, derecha, izquierda);
            }
        } while (derecha <= izquierda);
        return derecha; //primera posición de la segunda mitad}
    }

    private static void intercambiar(int[] aux, int pos1, int pos2) {
        int temp = aux[pos1];
        aux[pos1] = aux[pos2];
        aux[pos2] = temp;
    }

    public static void quickSortMejorado(int[] aux, int inicio, int fin) {
        int indicePivote = buscaPivote(aux, inicio, fin);
        if (indicePivote != -1) {
            int pivote = aux[indicePivote];
            intercambiar(aux, indicePivote, fin);
//pivote a la última posición
            int k = particion(aux, inicio, fin, pivote);
            intercambiar(aux, k, fin);
            quickSortMejorado(aux, inicio, k - 1);
            if (k < fin) {
                quickSortMejorado(aux, k + 1, fin);
            }
        }
    }

    // Ej 7
    private static void beadSort(int[] aux) {
        List<List<Character>> abaco = new LinkedList<>();
        for (int i = 0; i < aux.length; i++) {
            int num = 0;
            while (num < aux[i] && num < abaco.size()) {
                abaco.get(num).add('*');
            }
            if (num < aux[i]) {
                for (int j = num + 1; j <= aux[i]; j++) {
                    List<Character> nuevaLista = new LinkedList<>();
                    nuevaLista.add('*');
                    abaco.add(nuevaLista);
                }
            }

        }

        for (int i = 0; i < aux.length; i++) {
            int cont = abaco.size();
            aux[i] = cont;

            for (List<Character> l : abaco) {
                l.remove(0);
            }
            int j = cont - 1;
            while (j >= 0 && abaco.get(j).isEmpty()) {
                abaco.remove(j);
                j--;
            }
        }

    }

}
