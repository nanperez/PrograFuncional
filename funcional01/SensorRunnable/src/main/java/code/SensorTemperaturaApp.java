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
                               
            // Generar 20 lecturas de 20 a 40 °C
            for (int i = 0; i < 20; i++) {
                double temp = 20.0 + random.nextDouble()*20.0;
                LecturaSensor lectura = new LecturaSensor(
                        LocalDateTime.now(), lugar, temp);
                
                // Agregamos un tiempo de espera para que la lectura
                // de la fecha y hora cambie
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    System.getLogger(SensorTemperaturaApp.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
                // Agregamos las lecturas a la lista
                lecturas.add(lectura);
            }
        
        // Foreach Usando lambda,versión larga
        // lecturas.forEach(l -> System.out.println(nombre));
        // Foreach usando lambda, versión compacta
        lecturas.forEach(System.out::println);
            
        };
        
       generarLecturas.run();
        
        
    }
    
}
