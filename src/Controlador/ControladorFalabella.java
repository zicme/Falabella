package Controlador;

import Modelo.ModeloFalabella;
import Vista.VistaFalabella;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorFalabella implements ActionListener {

    private ModeloFalabella m;
    public VistaFalabella v;

    public ControladorFalabella(ModeloFalabella m, VistaFalabella v) {
        this.m = m;
        this.v = v;
        this.v.Continuar.addActionListener(this);
        this.v.mes.addActionListener(this);
        this.v.Dia.addActionListener(this);
        this.v.Año.addActionListener(this);
    }

    public void iniciar() {
        v.setTitle("Falabella");
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (v.Continuar == ae.getSource()) {
            try {
                if (v.Masculino.isSelected()) {
                    m.Ingresar(v.Rut.getText(), v.NombreApellidos.getText(), v.Celular.getText(), v.Email.getText(), v.Renta.getText(), "Masculino", v.CodigoSeguridad.getText(), (String) v.mes.getSelectedItem(),(String) v.Dia.getSelectedItem(),(String) v.Año.getSelectedItem());
                } else if (v.Femenino.isSelected()) {
                    m.Ingresar(v.Rut.getText(), v.NombreApellidos.getText(), v.Celular.getText(), v.Email.getText(), v.Renta.getText(), "Femenino", v.CodigoSeguridad.getText(),(String) v.mes.getSelectedItem(), (String) v.Dia.getSelectedItem(),(String) v.Año.getSelectedItem());
                }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "No se puede ingresar al sistema");
            }
        }
    }
}
