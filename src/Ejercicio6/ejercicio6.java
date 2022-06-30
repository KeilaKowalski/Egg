/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                        System.out.println("Ingrese num");
                        int num = leer.nextInt();
                        
                        if(num % 2 == 0) {
                            System.out.println("Es par");
                        }else {
                            System.out.println("No es par");
                        }

    }
    
}
