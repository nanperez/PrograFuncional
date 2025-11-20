/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nancy
 */
public class SensorTemperaturaApp {
    
    public static void main(String[] args) {
        Random random = new Random();
        List<LecturaSensor> lecturas = new ArrayList<>();
        String lugar = "Sala de software";
        // Tarea 1: Generar lecturas del sensor
        Runnable generarLecturas =()->{
            
            // Aqui vamos a capturar las fecha y hora local
            
            
            // Generar 20 lecturas de 20 a 40 °C
            for (int i = 0; i < 20; i++) {
                double temp = 20.0 + random.nextDouble()*20.0;
                LecturaSensor lectura = new LecturaSensor(
                        LocalDateTime.now(), lugar, temp);
            }
        
        
        
        };
        
        
    }
    
}
