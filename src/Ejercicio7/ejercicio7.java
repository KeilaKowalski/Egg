/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                                System.out.println("Ingrese una frase");
                                String frase = leer.next();
                                
                                if(frase.equals("eureka") ){
                                    System.out.println("Correcto");
                                }else {
                                    System.out.println("Incorrecto");
                                }

    }
    
}
