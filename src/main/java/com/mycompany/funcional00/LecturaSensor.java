/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcional00;

import java.time.LocalDateTime;

/**
 *
 * @author nancy
 */
public class LecturaSensor {
    
    private LocalDateTime fecha;
    private String lugar;
    private double temperatura;

    public LecturaSensor(LocalDateTime fecha, String lugar, double temperatura) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.temperatura = temperatura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "LecturaSensor{" + "fecha=" + fecha + ", lugar=" + lugar + ", temperatura=" + temperatura + '}';
    }
    
    
    
    
    
    
}
