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
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int resultado = suma(10, 10);
//        System.out.println(resultado);
//        
//        saludoPersonalizado("Keila");
//        
//        Scanner leer = new Scanner(System.in);
//        
//        String nombre = leer.next();
//        saludoPersonalizado(nombre);
//        
//        saludoPersonalizado(leer.next());

          suma(10, 10);
          int acumulador = 0;
          for (int i = 0; i < 10; i++) {
            acumulador = acumulador + i;
        }
          System.out.println(acumulador);
    }
    
    public static int suma(int a, int b){
        //logica
        int c = a + b;
        return c;
    }
    
    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola "+ nombre + " como estas?");
        
    }
    
    
}
