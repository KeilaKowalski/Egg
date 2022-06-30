/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Escriba una frase");
                String frase = leer.next();
                System.out.println(frase.toUpperCase());
                System.out.println(frase.toLowerCase());

    }
    
}
