/*
*Escribir un programa que pida una frase y la muestre toda en mayúsculas
*y después toda en minúsculas. 
*Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class ejercicioPractico03 {

   
    public static void main(String[] args) {
        
        String frase;
   
        System.out.println(" Ingrese una frase ");
        Scanner leer = new Scanner(System.in);
        String cadenas = leer.nextLine();
        
 
        System.out.println(" La frase en mayusculas es: " + cadenas.toUpperCase());
        
        System.out.println(" La frase en minusculas es: " + cadenas.toLowerCase());
        
        
              
    }   
}