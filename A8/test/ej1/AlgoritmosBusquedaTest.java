/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solactividad7;

import ej3.Ej3;
import ej4.Ej4;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Rosalia
 */
public class AlgoritmosBusquedaTest {

    private final int[] aux1 = {2, 8, 15, 15, 15, 30, 35, 45};

    @SuppressWarnings("FieldMayBeFinal")
    private int[] aux2 = {30, 25, 18, 15, 8, 2, 0, 0};

    @SuppressWarnings("FieldMayBeFinal")
    private int[][] aux3 = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2}};

    private static boolean matricesIguales(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Test of cuantosMenores method, of class AlgoritmosBusqueda.
     */
    /*@Test
    public void testCuantosMenoresExisteElemento() {
        System.out.println("cuantosMenores Existe el elemento");
        int elem = 15;
        int expResult = 2;
        int result = AlgoritmosBusqueda.cuantosMenores(aux1, elem);
        assertEquals(expResult, result);
    }

    /**
     * Test of cuantosMenores method, of class AlgoritmosBusqueda.
     */
 /*@Test
    public void testCuantosMenoresNoExisteElemento() {
        System.out.println("cuantosMenores NO Existe el elemento");
        int elem = 22;
        int expResult = 5;
        int result = AlgoritmosBusqueda.cuantosMenores(aux1, elem);
        assertEquals(expResult, result);
    }

    /**
     * Test of cuantosMayores method, of class AlgoritmosBusqueda.
     */
 /*@Test
    public void testCuantosMayoresExisteElemento() {
        System.out.println("cuantosMayores Existe el elemento");
        int elem = 15;
        int expResult = 3;
        int result = AlgoritmosBusqueda.cuantosMayores(aux1, elem);
        assertEquals(expResult, result);
    }

    /**
     * Test of cuantosMayores method, of class AlgoritmosBusqueda.
     */
 /*@Test
    public void testCuantosMayoresNoExisteElemento() {
        System.out.println("cuantosMayores NO Existe el elemnto");
        int elem = 22;
        int expResult = 3;
        int result = AlgoritmosBusqueda.cuantosMayores(aux1, elem);
        assertEquals(expResult, result);
    }

    /**
     * Test of rellenar method, of class AlgoritmosBusqueda.
     */
    @Test
    public void testRellenar() {
        System.out.println("rellenar");
        int x = 2;
        int y = 7;
        int nuevoColor = 3;
        int[][] result = {{1, 1, 1, 1, 1, 1, 1, 3, 1, 1},
        {2, 2, 2, 2, 2, 2, 2, 3, 2, 2},
        {2, 2, 2, 2, 2, 3, 3, 3, 3, 3},
        {2, 2, 2, 2, 2, 2, 2, 3, 2, 2},
        {2, 2, 2, 2, 2, 2, 2, 3, 2, 2}};
        Ej3.rellenar(aux3, x, y, nuevoColor);
        boolean toRet = matricesIguales(aux3, result);
        assertTrue(toRet);
    }

    /**
     * Test of busquedaInsercionDe method, of class AlgoritmosBusqueda.
     */
    @Test
    public void testBusquedaInsercionDe() {
        System.out.println("busquedaInsercionDe");
        int elem = 14;
        int max = 6;
        int expResult = 4;
        int result = Ej4.busquedaInsercionDe(aux2, elem, max);
        assertEquals(expResult, result);
    }

}
