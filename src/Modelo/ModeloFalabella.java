package Modelo;

import static BaseDeDatos.Conexion.getConnection;
import static BaseDeDatos.Conexion.stmt;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pc
 */
public class ModeloFalabella {

    public static final String Rut="";
    public static final String Nombre="";
    public static final String Celular="";
    public static final String Genero="";
    public static final String Codigo="";
    public static final String Email="";
    public static final String Renta="";
    public static final String Dia="";
    public static final String Mes="";
    public static final String Año="";
    public String RUT;
    public static final String CodigoIdentificador="";
    public static final char[] chr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
'k', 'l', 'm','n','o','p','q','r','s','t','u','v','w', 'x','y','z'};
    public static final char[] aleatorio = new char[4];
    public ModeloFalabella(String RUT) {
        this.RUT = RUT;   
    }
    public boolean Aleatorio() {
        for (int i = 0; i <= 3; i++) {
            aleatorio[i] = chr[(int) (Math.random() * 4)];
        }
        return false;
    }
    public boolean ValidarRut() {
        Boolean lDevuelve = false;
         int Ult = this.RUT.length();
         int Largo = this.RUT.length() - 3;
         int Constante = 2;
         int Suma = 0;
         int Digito = 0;
        for (int i = Largo; i >= 0; i--) {

            Suma = Suma + Integer.parseInt(this.RUT.substring(i, i + 1)) * Constante;
            Constante = Constante + 1;
            if (Constante == 8) {
                Constante = 2;
            }
        }
         String Ultimo = this.RUT.substring(Ult - 1).toUpperCase();
        Digito = 11 - (Suma % 11);
        if (Ultimo.equals("K") && Digito == 10) {
            lDevuelve = true;
        } else {
            if (Digito == 11 && Ultimo.equals("0")) {
                lDevuelve = true;
            } else {
                if (Digito == Integer.parseInt(Ultimo)) {
                    lDevuelve = true;
                }
            }
        }
        return lDevuelve;
    }

    public boolean Ingresar(String CodigoVerificador, String rut, String Nombre, String Celular, String Email, String Renta, String Genero, String Codigo, String Mes, String Dia, String Año) {
Boolean lDevuelve = false;
//Validar Nombre y Apellido       
        Pattern nn = Pattern
                .compile("[A-Z][a-zA-Z]*\\D{3}");
        Matcher m = nn.matcher(Nombre);
//Validar Correo
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(Email);
        //Fin validar Correo
        String insertar;
        Connection con = getConnection();
        try {
            if (rut.length() < 8) {
                JOptionPane.showMessageDialog(null, "El  campo de rut tiene que ser de 8 digítos", "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            if (rut.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo de rut  está vacío", "Error de captura", JOptionPane.ERROR_MESSAGE);
            } else if (rut.length() == 8) {
                if (Celular.length() < 9) {
                    JOptionPane.showMessageDialog(null, "El  campo de Celular tiene que ser de 9 digítos", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
                if (Celular.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo de Celular  está vacío", "Error de captura", JOptionPane.ERROR_MESSAGE);
                } else if (Celular.length() == 9) {

                    if (Renta.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El campo de Renta  está vacío", "Error de captura", JOptionPane.ERROR_MESSAGE);
                    } else if (Renta.length() <= 15) {
                        if (Arrays.equals(aleatorio, Codigo.toCharArray())) {
                            RUT = rut + "-" + CodigoVerificador;
                            ModeloFalabella sd = new ModeloFalabella(RUT);
                            if (sd.ValidarRut()== true) {
                                if (mather.find() == true) {
                                    if (m.find() == true) {
                                        insertar = "insert into Cliente values('" + rut + "-" + CodigoVerificador + "','" + Nombre + "','" + Celular + "','" + Email + "','" + Renta + "','" + Genero + "','" + Codigo + "','" + Mes + "/" + Dia + "/" + Año + "');";
                                        stmt = con.createStatement();
                                        stmt.executeUpdate(insertar);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El Nombre y Apellido ingresado es inválido.", "Error de captura", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El email ingresado es inválido.", "Error de captura", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El rut es Invalido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "ALERTA: Codigo Incorrecto");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El  campo de Renta tiene que ser un rango de [0] a [15] digítos", "Error de captura", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Campo de Celular NO VALIDO", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campo de rut NO VALIDO", "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            //stmt.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "ALERTA: Hubo un error desconocido");
            System.err.println("SQLException: " + err.getMessage());
            System.exit(0);

        }
        
        return lDevuelve;
    }
    
}
