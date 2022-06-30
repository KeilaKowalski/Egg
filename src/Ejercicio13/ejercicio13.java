/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de elementos para dibujar el cuadrado");
        int n = leer.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
