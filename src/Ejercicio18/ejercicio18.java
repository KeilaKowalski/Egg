/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        int[][] matrizTranspuesta = new int[4][4];
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        mostrar(matriz);
        
        System.out.println("");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        mostrar(matrizTranspuesta);
        
        
    }
    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
