/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorFalabella;
import Vista.VistaFalabella;
import javax.swing.UIManager;


/**
 *
 * @author Pc
 */
public class Falabella {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) {

        }
        ModeloFalabella m = new ModeloFalabella("");
        VistaFalabella v = new VistaFalabella();
        ControladorFalabella c = new ControladorFalabella(m, v);
        c.iniciar();
    }

}
