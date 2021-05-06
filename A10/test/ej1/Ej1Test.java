/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import A10.Ej1;
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
public class Ej1Test {

    public Ej1Test() {
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
     * Test of ordenar method, of class Ej1.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenacionBurbuja2Direc");
        int[] aux = {4, 6, 2, 8, 5, 12, 15};
        int[] expResult = {2, 4, 5, 6, 8, 12, 15};
        Ej1.ordenacionBurbuja2Direc(aux);
        assertArrayEquals(aux, expResult);
    }

}
