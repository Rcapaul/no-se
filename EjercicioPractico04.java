/*
*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
*Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaintro01;

import java.util.Scanner;

/*
 * @author Paul
 */
public class EjercicioPractico04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float C = 37;
        float F = 32 + (9*C/5);
                
        System.out.println(" El equivalente de 30 Grados Celsius a Fahrenheit son " + F );
        
                       
    }
    
}
