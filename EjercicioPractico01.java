package javaintro01;

import java.util.Scanner; 
public class EjercicioPractico01 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    //Escribir un programa que pida dos números enteros por teclado
    //y calcule la suma de los dos. 
    //el programa deberá después mostrar el resultado de la suma        
    Scanner entrada = new Scanner(System.in);
    int num1, num2, suma;
    //guardamos los 2 numeros
    System.out.println("ingrese 2 numeros a sumar");
    
    num1 = entrada.nextInt();
    num2 = entrada.nextInt();
    
    suma = num1+num2;
    
    System.out.println("\nLa suma de los numeros es:"+suma);
    
    }
    
}
