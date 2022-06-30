/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
                System.out.println("Ingrese el tamaño del vector");
                int n = leer.nextInt();
                int[] vector = new int[n];
                
                for(int i = 0; i < vector.length; i++){
                    vector[i] = (int) (Math.random() * 100);
                }
                
                System.out.println("Ingrese el numero a buscar en el vector");
                int numero = leer.nextInt();
                
                int cantidad = 0;
                for(int i = 0; i < vector.length; i++){
                    if(vector[i] == numero){
                        cantidad++;
                    }
                }
                
                for(int i = 0; i < vector.length; i++){
                    System.out.print("["+vector[i]+"]");
                }
                
                System.out.println("El numero " + numero + " se encuentra en el vector " + cantidad + " veces");
                      
                        

    }
    
}
