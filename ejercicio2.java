/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. 
 */
package javaintro01;

import java.util.Scanner;

/**
 * @author Paul
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
       
        String nombre;
        
        System.out.println("ingrese su nombre:");
        
        nombre = info.next ();
        
        System.out.println("su nombre es:"+nombre);
        
    }
    
}
