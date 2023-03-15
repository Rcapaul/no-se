/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
 *el doble, el triple y la raíz cuadrada de ese número. 
 *Nota: investigar la función Math.sqrt(). 
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Paul
 */
public class EjercicioPractico05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numraiz;
        int numdoble;
        int numtriple;
                
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Ingrese el numero que desea averiguar su doble , triple y raiz ");
       
         numraiz = leer.nextInt();
         
         numdoble = numraiz * 2;
         
         numtriple = numraiz *3;
        
         double raiz = Math.sqrt(numraiz);
    
        System.out.println("El numero doble de " + numraiz + " es " + numdoble "es" + (numtriple)+(raiz)+ "es");
        
      
    
    }
    
}
