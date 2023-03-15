/*
 *Define una variable que aloje tu nombre y otra que guarde tu edad.
*Imprime ambas variables por pantalla.
*Recomendamos que hagan el siguiente experimento:
*tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
*Esto nos va a generar un System.out.println() para poder escribir lo que queramos.
 */
package javaintro01;

/**
 *
 * @author Paul
 */
public class Ejercicio4Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Paul";
        int edad = 24;
        
        System.out.print(" Mi nombre es: "+ nombre );
        System.out.print(" Y tengo " + edad);
        System.out.print(" años ");
                
    }
    
}
