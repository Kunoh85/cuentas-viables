/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Usuario
 */
public class Solucion {
    
    Integer volumen;
    Integer concentracion;

    public Solucion(Integer volumen, Integer concentracion) {
        this.volumen = volumen;
        this.concentracion = concentracion;
    }

    public Solucion() {
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(Integer concentracion) {
        this.concentracion = concentracion;
    }
    
    
    
}
