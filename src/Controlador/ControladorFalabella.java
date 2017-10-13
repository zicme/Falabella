package Controlador;

import Modelo.ModeloFalabella;
import Vista.VistaFalabella;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorFalabella implements ActionListener {

    private final ModeloFalabella m;
    public VistaFalabella v;

    public ControladorFalabella(ModeloFalabella m, VistaFalabella v) {
        this.m = m;
        this.v = v;
        this.v.Continuar.addActionListener(this);
        this.v.mes.addActionListener(this);
        this.v.Dia.addActionListener(this);
        this.v.Año.addActionListener(this);
        this.v.Reiniciar.addActionListener(this);
        this.v.Salir.addActionListener(this);
    }

    public void iniciar() {
        v.setTitle("Falabella");
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        m.Aleatorio();
        v.jtt.setText(Arrays.toString(m.aleatorio));
      
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (v.Continuar == ae.getSource()) {
            try {
                if (v.Masculino.isSelected()) {
                    m.Ingresar(v.CodigoVerificador1.getText(), v.Rut.getText(), v.NombreApellidos.getText(), v.Celular.getText(), v.Email.getText(), v.Renta.getText(), "Masculino", v.CodigoSeguridad.getText(), (String) v.mes.getSelectedItem(),(String) v.Dia.getSelectedItem(),(String) v.Año.getSelectedItem());
                } else if (v.Femenino.isSelected()) {
                    m.Ingresar(v.CodigoVerificador1.getText(),v.Rut.getText(), v.NombreApellidos.getText(), v.Celular.getText(), v.Email.getText(), v.Renta.getText(), "Femenino", v.CodigoSeguridad.getText(),(String) v.mes.getSelectedItem(), (String) v.Dia.getSelectedItem(),(String) v.Año.getSelectedItem());
                }else{
                    JOptionPane.showMessageDialog(null, "Campo de sexo no ingresado");
                }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
            }
        }else if(v.Reiniciar==ae.getSource() ){
             try {
           v.dispose();
            ModeloFalabella m = new ModeloFalabella("");
        VistaFalabella v = new VistaFalabella();
        ControladorFalabella c = new ControladorFalabella(m, v);
        c.iniciar();
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
            }
        }else if(v.Salir==ae.getSource()){
             try {
                 System.exit(0);
                  } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
            }
             }
        }
        
        
        
    
}
