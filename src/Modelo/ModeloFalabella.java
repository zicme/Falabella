package Modelo;

import static BaseDeDatos.Conexion.getConnection;
import static BaseDeDatos.Conexion.stmt;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class ModeloFalabella {
    public String Rut;
    public String Nombre;
    public String Celular;
    public String Genero;
    public String Codigo;
    public String Email;
    public String Renta;
    public String Dia;
    public String Mes;
    public String Año;
    public ModeloFalabella(String Dia, String Mes,String Año,String Codigo,String Genero,String Rut,String Celular,String Email,String Renta,String Nombre){
        this.Rut=Rut;
        this.Dia=Dia;
        this.Mes=Mes;
        this.Año=Año;
        this.Codigo=Codigo;
        this.Genero=Genero;
        this.Celular=Celular;
        this.Email=Email;
        this.Nombre=Nombre;
        this.Renta=Renta;
    }
    public void Ingresar(String Rut, String Nombre,String Celular,String Email,String Renta,String Genero,String Codigo,String Mes,String Dia,String Año) {
        String insertar;
        Connection con = getConnection();
        try {
            if("umlta".equals(Codigo)){
            insertar = "insert into Cliente values('" + Rut + "','" + Nombre + "','" + Celular + "','" + Email + "','" + Renta +"','" +Genero+"','" +Codigo+"','" +Mes+"','"+Dia+"','"+Año+"');";
            stmt = con.createStatement();
            stmt.executeUpdate(insertar);
             }else{
                JOptionPane.showMessageDialog(null, "ALERTA: Codigo Incorrecto");
            }
            stmt.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "ALERTA: Hubo un error desconocido");
            System.err.println("SQLException: " + err.getMessage());
            System.exit(0);

        }
    }
}
