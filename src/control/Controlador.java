/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Solucion;
import vista.Ventana;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    Solucion concentrado;
    Solucion armado;
    Ventana ventana;

    public Controlador() {
        this.concentrado =  new Solucion();
        this.armado = new Solucion();
        this.ventana = new Ventana();
    }
    
    public void iniciar(){
        ventana.getBotonCalcular();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
        
    
}
