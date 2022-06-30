/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicios1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los numeros a sumar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros es igual a: " + (num1 + num2));
    }
    
}
