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
public class ProductoVectorMAtriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tipo[] nombreVector = new tipo[tamaño]
        
        //declarar un arreglo de una dimension
        int[] vector;
        //crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        //los dos pasos en una linea
        int[] producto = new int[3];
        
        //tipo[][] nombreMatriz = new tipo[filas][columnas]
        //declaracion e inicializacion con valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        //declaracion y creacion de arreglos genericos
        //tipo[][]...[] nombreArreglo = new tipo[cardinalidad1][cardinalidad2]...[cardinalidadN]
        
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        Scanner leer = new Scanner(System.in);
        //int = 0, porque los subindices de los arreglos en JAva inician en cero
        for (int i = 0; i<vector.length; i++) {
            System.out.print("v["+i+"]m");
            //Acceder al valor i del vector
            vector[i] = leer.nextInt();
        }
        
        //Multiplica vector por matriz
        int sum;
        //..para cada columna de la matriz..
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //..recorro el vector y multiplico
            for (int i = 0; i<vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";
      
        //Mostrar vector
        System.out.println("*Vector:");
        //bucle for "mejorado"
        //for (tipo elemento: arreglo)
        for( int elemento: vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        
        //Mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for(int elemento: fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        
        //Mostrar resultado
    aux = "";
    System.out.println("\n* Vector x Matriz:");
    for (int elemento: producto) {
        aux += " " + elemento;
    }
    System.out.println(aux);
    
    
    
}
    
}
