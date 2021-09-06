/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adlpr
 */
public class SalaTest {
    
    public SalaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumeroSala method, of class Sala.
     */
    @Test
    public void testGetNumeroSala() {
        System.out.println("getNumeroSala");
        Sala instance = new Sala();
        int expResult = 0;
        int result = instance.getNumeroSala();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroSala method, of class Sala.
     */
    @Test
    public void testSetNumeroSala() {
        System.out.println("setNumeroSala");
        int numero = 0;
        Sala instance = new Sala();
        instance.setNumeroSala(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButacas method, of class Sala.
     */
    @Test
    public void testGetButacas() {
        System.out.println("getButacas");
        Sala instance = new Sala();
        char[][] expResult = null;
        char[][] result = instance.getButacas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButacas method, of class Sala.
     */
    @Test
    public void testSetButacas() {
        System.out.println("setButacas");
        char[][] butacas2 = null;
        Sala instance = new Sala();
        instance.setButacas(butacas2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstadoSala method, of class Sala.
     */
    @Test
    public void testCambiarEstadoSala() {
        System.out.println("cambiarEstadoSala");
        int i = 0;
        int j = 0;
        Sala instance = new Sala();
        instance.cambiarEstadoSala(i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEstadoSala method, of class Sala.
     */
    @Test
    public void testMostrarEstadoSala() {
        System.out.println("mostrarEstadoSala");
        Sala instance = new Sala();
        instance.mostrarEstadoSala();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentaRecaudacion method, of class Sala.
     */
    @Test
    public void testAumentaRecaudacion() {
        System.out.println("aumentaRecaudacion");
        Sala instance = new Sala();
        instance.aumentaRecaudacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disminuyerecaudacion method, of class Sala.
     */
    @Test
    public void testDisminuyerecaudacion() {
        System.out.println("disminuyerecaudacion");
        Sala instance = new Sala();
        instance.disminuyerecaudacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecaudacion method, of class Sala.
     */
    @Test
    public void testGetRecaudacion() {
        System.out.println("getRecaudacion");
        Sala instance = new Sala();
        int expResult = 0;
        int result = instance.getRecaudacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Sala.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Sala instance = new Sala();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Sala.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Sala instance = new Sala();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCartelAscii method, of class Sala.
     */
    @Test
    public void testGetCartelAscii() {
        System.out.println("getCartelAscii");
        Sala instance = new Sala();
        String expResult = "";
        String result = instance.getCartelAscii();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartelAscii method, of class Sala.
     */
    @Test
    public void testSetCartelAscii() {
        System.out.println("setCartelAscii");
        String cartelAscii = "";
        Sala instance = new Sala();
        instance.setCartelAscii(cartelAscii);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
