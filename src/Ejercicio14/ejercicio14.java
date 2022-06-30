/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Ingrese la cantidad de euros");
                double euros = leer.nextDouble();
                
                System.out.println("Ingrese la moneda a convertir: \n 1.Libras \n 2.USD \n 3.Yenes");
                String moneda = leer.next();
                
                convertir(euros, moneda);

    }
    public static void convertir(double euros, String moneda){
        switch(moneda){
            case "1":
                System.out.println(euros+" euros son "+euros*0.86+" libras");
                break;
            case "2":
                System.out.println(euros+" euros son "+euros*1.28611+" USD");
                break;
            case "3":
                System.out.println(euros+" euros son "+euros*129.852+" Yenes");
                break;
            default:
                System.out.println("La moneda introducida no es válida");
            
                
                
        }
    }
    
}
