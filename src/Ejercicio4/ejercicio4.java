/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese  cantidad de grados centigrados");
        int grados = leer.nextInt();
        int f = 32 + (9 * grados / 5);
        System.out.println("El equivalente en grados Fahrenheit es: " + f);
    }
    
}
