/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.Armado;
import modelos.Concentrado;
import vista.Ventana;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    Ventana ventana;

    public Controlador() {      
        this.ventana = new Ventana();
    }
    
    public void iniciar(){
        ventana.getBotonCalcular().addActionListener(this);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ventana.getBotonCalcular())){
            
            Armado arm = new Armado(
            Integer.valueOf(ventana.getCarbVolReactor().getText()),
            Integer.valueOf(ventana.getCarbTeorica().getText()));
            
            Concentrado conc = new Concentrado(
            Integer.valueOf(ventana.getCarbVolConc().getText()),
            Integer.valueOf(ventana.getCarbConcentrado().getText()));
            
            Integer resultado = (arm.getVolumen()*arm.getConcentracion()-arm.getVolumen()*
                    Integer.valueOf(ventana.getCarbPrevia().getText()))/
                    conc.getConcentracion();
                                   
            ventana.getCarbVolConcentrado().setText(Integer.toString(resultado));         
         
        }   
    }
    
}