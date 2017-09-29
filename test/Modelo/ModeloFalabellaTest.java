/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Pc
 */
public class ModeloFalabellaTest {

    public ModeloFalabellaTest() {
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
     * Test of Aleatorio method, of class ModeloFalabella.
     */
    @Test
    public void testAleatorio() {
        System.out.println("Aleatorio");
        ModeloFalabella instance = new ModeloFalabella("", "", "", "", "", "", "", "", "", "", "");
        instance.Aleatorio();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of ValidarRut method, of class ModeloFalabella.
     */
    /*@Test
    public void testValidarRut() {
        System.out.println("ValidarRut");
        ModeloFalabella instance = null;
        boolean expResult = false;
        boolean result = instance.ValidarRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of Ingresar method, of class ModeloFalabella.
     */
    @Test
    public void testIngresar() {
        System.out.println("Ingresar");
        String CodigoVerificador = "";
        String rut = "";
        String Nombre = "";
        String Celular = "";
        String Email = "";
        String Renta = "";
        String Genero = "";
        String Codigo = "";
        String Mes = "";
        String Dia = "";
        String Año = "";
        ModeloFalabella instance = new ModeloFalabella("", "", "", "", "", "", "", "", "", "", "");
        instance.Ingresar(CodigoVerificador, rut, Nombre, Celular, Email, Renta, Genero, Codigo, Mes, Dia, Año);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
