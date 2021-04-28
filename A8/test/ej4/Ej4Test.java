/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kingo
 */
public class Ej4Test {

    private final int[] aux1 = {2, 8, 15, 15, 15, 30, 35, 45};

    @SuppressWarnings("FieldMayBeFinal")
    private int[] aux2 = {30, 25, 18, 15, 8, 2, 0, 0};

    @SuppressWarnings("FieldMayBeFinal")
    private int[][] aux3 = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2}};

    public Ej4Test() {
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

    /**
     * Test of busquedaInsercionDe method, of class Ej4.
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
