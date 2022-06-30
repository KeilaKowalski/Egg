/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Ingrese un numero");
                int num = leer.nextInt();
                
                System.out.println("El doble es: "+ (num * 2));
                System.out.println("El triple es: "+ (num * 3));
                System.out.println("La raiz cuadrada es: "+ Math.sqrt(num));

    }
    
}
