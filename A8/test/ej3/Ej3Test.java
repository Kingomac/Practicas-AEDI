/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author kingo
 */
public class Ej3Test {

    @SuppressWarnings("FieldMayBeFinal")
    private int[][] aux3 = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 1, 1, 1, 1, 1},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2},
    {2, 2, 2, 2, 2, 2, 2, 1, 2, 2}};

    public Ej3Test() {
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
     * Test of rellenar method, of class Ej3.
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

}
