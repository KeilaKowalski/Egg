/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int digitos = 5;
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * Math.pow(10, digitos));
        }
        
        for(int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        
        
        int[] cantidad = new int[digitos];
        for(int i = 0; i < digitos; i++){
            cantidad[i] = 0;
        }
        
        double numero;
        int digito;
        for(int i = 0; i < vector.length; i++){
            numero = vector[i];
            digito = 0;
            while(numero >= 1){
                numero = numero / 10;
                digito++;
            }
            cantidad[digito-1]++;
        }
        
        for(int i = 0; i < digitos; i++){
            System.out.println("Cantidad de numeros de "+(i+1)+" digito/s: "+cantidad[i]);
        }

    }
    
}
