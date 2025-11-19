
package com.mycompany.funcional00;



/**
 *
 * @author nancy
 */
public class Funcional00 {
    
    // Este método - función de orden superior
    public static void generico(String tipoOp, Runnable tarea ){
        tarea.run();
    }
   
    public static void main(String[] args) {
        // Expresion que manda mensaje
       Runnable tarea = ()->System.out.println("Hola Java desde un hilo");
           
       // Expresión con un cálculo
       Runnable calculo = ()->{
       int suma = 0;
           for (int i = 1; i <= 10; i++) {
               suma = suma+i;
           }
           System.out.println("La suma es"+suma);
       };
       
        generico("Mensaje", tarea);
        generico("Calculo", calculo);
}
}
