/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Armado;
import modelos.Concentrado;
import vista.Ventana;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    Concentrado concentrado;
    Armado armado;
    Ventana ventana;

    public Controlador() {
        this.concentrado =  new Concentrado();
        this.armado = new Armado();
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
            Integer.parseInt(ventana.getCarbVolReactor().getText()),
            Integer.parseInt(ventana.getCarbTeorica().getText()));
            
            Concentrado conc = new Concentrado(
            Integer.parseInt(ventana.getCarbVolConc().getText()),
            Integer.parseInt(ventana.getCarbConcentrado().getText()));
            
            Integer resultado = arm.getVolumen()*arm.getConcentracion();
            resultado= resultado/conc.getConcentracion();
            
            JOptionPane.showMessageDialog(ventana, ventana.getCarbVolConc());
        }    
    }
    
    public void  calcular(){
        
    }
        
    
}
