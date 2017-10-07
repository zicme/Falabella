/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
   

    /**
     *
     * @param letras
     */
    

    /**
     *
     * @param n
     * @return
     */
   
    public boolean ComprobaciónAleatorio(boolean n){
        ModeloFalabella dfc=new ModeloFalabella("","","", "","","","", "","", "", "");
        boolean f = dfc.Aleatorio();
        n=f;
        if (f==n) {
            System.out.println("Comprobacion numeros aleatorios");
        } else {
            System.out.println("no a pasado el Test");
            fail("The test case is prototype");
        }
        return false;
    }
    public void testNombre() {
        String nombre = "felipe peña";
        String nombre4="sssssssssss";
        String nombre3="Felipe Peña";
        String alerta="";
        try {
            nombre2(nombre3);
            System.out.println("Nombre Correcto");
        } catch (Excepcionnombre e) {
             alerta = e.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }
    }
    public class Excepcionnombre extends Exception{
        public Excepcionnombre(String mensaje){
            super(mensaje);
        }
    }
    public void nombre2(String nombre1) throws Excepcionnombre {
         Pattern nn = Pattern.compile("[A-Z][a-zA-Z]*\\D{3}");
        Matcher m = nn.matcher(nombre1);
        if ((m.find() == false)){
            throw new Excepcionnombre ("Nombre Invalido");
        }
    }
    public void testRut(){
        String rut="18739183-0";
        String rut1="33444444444";
        boolean expResult = true;
        ModeloFalabella instance = new ModeloFalabella(rut);
        boolean result = instance.ValidarRut();
        try {
            System.out.println("Rut ");
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("The test case is prototype");
        }
    }
    
    public void testCorreo() {
        String correo = "pipe@gmlhh";
        String correo3="pipe21@gmail.com";
        String correo4="eeeeeeeeeeee";
        String alerta="";
        try {
            correo2(correo);
            System.out.println("Correo Correcto");
        } catch (Excepcioncorreo e) {
             alerta = e.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }
    }
    public class Excepcioncorreo extends Exception{
        public Excepcioncorreo(String mensaje){
            super(mensaje);
        }
    }
    public void correo2(String correo1) throws Excepcioncorreo {
         Pattern nn = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher m = nn.matcher(correo1);
        if ((m.find() == false)){
            throw new Excepcioncorreo ("Correo Invalido");
        }
    }
    
    
    
    
    public void testAnio(){
        String a1 = "1998";
        String a2 = "1922";
        String a3 = "2000";
        String alerta = "";
        try {
            anio(a3);
            System.out.println("Anio correcto");
        } catch (ExcepcionAnio a) {
            alerta = a.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }
        
    }
    //Excepcion Propia
    public class ExcepcionAnio extends Exception{
        public ExcepcionAnio(String mensaje){
            super(mensaje);
        }
    }
    
   //validador para excepcion 
    public void anio(String num) throws ExcepcionAnio {
        int n = Integer.parseInt(num);
        if ((n<1923)||(n>1999)){
            throw new ExcepcionAnio ("Fecha Invalida");
        }
    }
    
    public void testMes(){
        String m1 = "0";
        String m2 = "9";
        String m3 = "13";
        String alerta = "";
        try {
            vMes(m1);
            System.out.println("Mes valido");
        } catch (ExcepcionMes e) {
             alerta = e.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }
    }
    
    public class ExcepcionMes extends Exception{
        public ExcepcionMes (String mensaje){
            super (mensaje);
        }  
    }
    public void vMes(String mes) throws ExcepcionMes{
        int m = Integer.parseInt(mes);
        if((m<1)||(m>12)){
            throw new ExcepcionMes ("Mes fuera de rango");
        }
    }
    
    public void testDia(){
        String d10="15";
        String d11="0";
        String d12="32";
        String m1 ="1";
        String d20="6";
        String d21="30";
        String d22="0";
        String m2 ="2";
        String d30="30";
        String d31="0";
        String d32="31";
        String m3 ="9";
        String alerta = "";        
        try {
            vDias(d10, m1);
            System.out.println("Dia valido");
        } catch (ExcepcionDias e) {
            alerta = e.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }          
    }
    public class ExcepcionDias extends Exception{
        public ExcepcionDias(String mensaje){
            super(mensaje);
        }
    }
    public void vDias(String dia, String mes ) throws ExcepcionDias{
        int d = Integer.parseInt(dia);
        int M = Integer.parseInt(mes);
        if(((M==1)||(M==3)||(M==5)||(M==7)||(M==8)||(M==10)||(M==12))&&((d<0)||(d>31))){
            throw new ExcepcionDias("Limite de dias sobrepasado");            
        }
        if (((M==4)||(M==6)||(M==9)||(M==11))&&((d<0)||(d>30))){
            throw new ExcepcionDias("Limite de dias sobrepasado");
        }
        if ((M==2)&&((d<0)||(d>29))){
            throw new ExcepcionDias("Limite de dias sobrepasado");
        }
    }
    
    public void testRenta(){
       String r1 = "1456432";
       String r2="-1";
       String r3="999999999999999";
       String alerta = "";
        try {
            vRenta(r3);
            System.out.println("Valor dentro de los parametros");
        } catch (ExcepcionRenta e) {
            alerta = e.getMessage();
            System.err.println(alerta);
            fail(alerta);
        }   
    }
    public class ExcepcionRenta extends Exception{
        public ExcepcionRenta(String mensaje){
            super(mensaje);
        }
    }
    public void vRenta(String renta) throws ExcepcionRenta{
        long r = Long.parseLong(renta);
        if ((r>999999999999999L)||(r<0L)){
            throw new ExcepcionRenta ("Renta inconsistente con los parametros");
        }
    }
    
    
    @Test
    public void test(){
         ModeloFalabellaTest instance = new ModeloFalabellaTest();
         //instance.ComprobaciónAleatorio(true);
        // instance.testRut();
        // instance.testNombre();
         instance.testCorreo();
        // instance.testAnio();
         //instance.testMes();
       //  instance.testDia();
        // instance.testRenta();
    }
    
    
        

}
