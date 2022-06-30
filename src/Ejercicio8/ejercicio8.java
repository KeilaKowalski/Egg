/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        System.out.println("");
        
    if (frase.length() == 8){
        System.out.println("CORRECTO, la palabra tiene 8 caracteres");
        System.out.println("");}
    
    else {
        System.out.println("INCORRECTO, la palabra no tiene 8 caracteres");
        System.out.println("");} 
    }    

    }
    

