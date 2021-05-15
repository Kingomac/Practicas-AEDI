/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A10;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kingo
 */
public class A10Test {

    public A10Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testOrdenacionBurbuja2Direc() {
        System.out.println("ordenacionBurbuja2Direc");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {2, 4, 5, 6, 8, 12, 15};
        A10.ordenacionBurbuja2Direc(aux);
        assertArrayEquals(aux, expResult);

    }

    @Test
    public void testOrdenacionRaiz() {
        System.out.println("ordenacionRaiz");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {2, 4, 5, 6, 8, 12, 15};
        A10.ordenacionRaiz(aux);
        assertArrayEquals(aux, expResult);

    }

    @Test
    public void testOrdSeleccion() {
        System.out.println("OrdSeleccion");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {15, 12, 8, 6, 5, 4, 2};
        A10.ordSeleccion(aux);
        assertArrayEquals(aux, expResult);
    }

    @Test
    public void testOrdenarConteo() {
        System.out.println("ordenarConteo");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {15, 12, 8, 6, 5, 4, 2};
        A10.ordenarConteoDec(aux);
        assertArrayEquals(aux, expResult);
    }

    @Test
    public void testOrdShell() {
        System.out.println("OrdShell");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {2, 4, 5, 6, 8, 12, 15};
        A10.ordShell(aux);
        assertArrayEquals(aux, expResult);
    }

//    @Test
//    public void testQuickSort() {
//        System.out.println("quickSort");
//        int[] aux = {4, 6, 2, 8, 5, 12, 15};
//        int[] expResult = {2, 4, 5, 6, 8, 12, 15};
//        int inicio = 0;
//        int fin = 6;
//        A10.quickSort(aux, inicio, fin);
//        assertArrayEquals(aux, expResult);
//    }
//
//    @Test
//    public void testBeadSort() {
//        System.out.println("beadSort");
//        int[] aux = {4, 6, 2, 8, 5, 12, 15};
//        int[] expResult = {15, 12, 8, 6, 5, 4, 2};
//        A10.beadSort(aux);
//        assertArrayEquals(aux, expResult);
//    }
}
