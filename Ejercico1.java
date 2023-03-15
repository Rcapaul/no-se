
package ejercico1;

import java.util.Scanner;


public class Ejercico1 {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num1;
        int num2;
        
        System.out.println("Ingresa el primer numero a sumar");
        num1=leer.nextByte();
        System.out.println("Ingresa el segundo numero a sumar");
        num2=leer.nextByte();
        
        System.out.println("La suma de los numeros es :"+ (num1 + num2));
    }
}
