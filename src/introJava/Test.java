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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variable scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //creo la variable string
        String nombre;
        //muestra un msj por pantalla
        System.out.println("Ingrese tu nombre:");
        //leemos el nombre de la persona enla variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("hola Mundo! Soy " + nombre + " y estoy programando en Java!");
        
    }
    
}
