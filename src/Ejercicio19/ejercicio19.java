/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicio19;

import java.io.File;

/**
 *
 * @author Usuario
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
             // try catch block
	     try {
                      // create the file object
		      File myFile = new File("ejercicio19.2");

		      // call the getAbsolutePath() method
		      String absolutePath = myFile.getAbsolutePath();

		      System.out.println("The Absolute path of the file is: "+ absolutePath);
		 }
	     catch (Exception e) {
		      System.err.println(e.getMessage());
		 }
	}
    
}
