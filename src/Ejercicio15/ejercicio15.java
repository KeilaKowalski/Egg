/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[100];
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = i + 1;
        }
        for(int j = vector.length - 1; j >= 0; j --){
            System.out.println(vector[j]);  
                
        }

    }
    
}
