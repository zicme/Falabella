/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
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
    ModeloFalabella sc=new ModeloFalabella("","","","","","","", "","","","");

    /**
     *
     * @param letras
     */
    

    /**
     *
     * @param n
     * @return
     */
   
    public boolean cs(boolean n){
        ModeloFalabella dfc=new ModeloFalabella("","","", "","","","", "","", "", "");
        boolean f = dfc.Aleatorio();
        n=true;
        if (f==n) {
            System.out.println("Comprobacion");
        } else {
            System.err.println("ss");
             fail("The test case is prototype");
        }
        return false;
    }
    
    @Test
    public void test(){
         ModeloFalabellaTest instance = new ModeloFalabellaTest();
         instance.cs(true);
    }
    public void testIngresar() {
        System.out.println("Ingresar");
        String CodigoVerificador ="";
        String rut = "18739";
        String Nombre = "lipe eña";
        String Celular = "3456789";
        String Email = "skpi1@gmaicom";
        String Renta = "dsfsd";
        String Genero = "";
        String Codigo = "";
        String Mes = "";
        String Dia = "";
        String Año = "";
        ModeloFalabella instance = new ModeloFalabella("", "", "", "", "", "", "", "", "", "", "");
        instance.Ingresar(CodigoVerificador, rut, Nombre, Celular, Email, Renta, Genero, Codigo, Mes, Dia, Año);
        boolean expResult= false;
        boolean result=instance.Ingresar(CodigoVerificador, rut, Nombre, Celular, Email, Renta, Genero, Codigo, Mes, Dia, Año);
        try{
           assertEquals(expResult, result);
        }catch(Exception e){
       fail("The test case is prototype");
        }
    }
        

}
