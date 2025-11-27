/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author nancy
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjemploLikesRedSocial {

    public static void main(String[] args) {

        // 1. "Feed" de publicaciones
        List<Publicacion> feed = Arrays.asList(
                new Publicacion("ana",   "Amo programar en Java",        80,  500),
                new Publicacion("luis",  "FP + Streams = ❤️",           150, 900),
                new Publicacion("maria", "Café y código",               40,  200),
                new Publicacion("sofia", "Hoy sí compila a la primera", 10,  120),
                new Publicacion("carlos","Bug encontrado (otra vez)",   95,  600)
        );

        // 2. Functions

        // a) Dar un like extra a cada publicación
        Function<Publicacion,Publicacion> darLike = p ->
                p.conLikes(p.getLikes()+1);

        // b) Boost del algoritmo:
        //    si los likes son >= 100, se agregan 20 likes extra (post "tendencia")
        Function<Publicacion, Publicacion> boostAlgoritmo = p -> {
            if (p.getLikes() >= 100) {
                return p.conLikes(p.getLikes() + 20);
            }
            return p;
        };

        // c) Calcular engagement en porcentaje (likes / vistas * 100)
        //    Se regresa un Double
        Function<Publicacion, Double> aEngagement =
                p -> p.getVistas() == 0
                        ? 0.0
                        : (p.getLikes() * 100.0) / p.getVistas();

        // 3. Componer funciones:
        // primero dar like, luego aplicar boost, luego calcular engagement
        Function<Publicacion, Double> procesoEngagement =
                darLike
                        .andThen(boostAlgoritmo)
                        .andThen(aEngagement);


        System.out.println("=== Engagement por publicación (después del algoritmo) ===");
        //4. Uso de Streams: aplicar el proceso a cada publicación
        feed.stream()
                .map(procesoEngagement)      // Stream<Double>
                .forEach(e ->
                        System.out.println(String.format("%.2f %%", e))
                );

        
    }
}
