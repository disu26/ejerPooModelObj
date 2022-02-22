
package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Ejercicio #6, implementaciónd de la clase vector, se leeran valores hasta 
 * que se detecten dos numeros seguidos iguales.
 * 
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Vector newVector = new Vector();
        int num = 0;
        int prev;
        boolean sw = true;
        while (sw) {
            prev = num;
            System.out.println("Introduce un número: ");
            num = read.nextInt();
            if (num == prev) {
                System.out.println("Dos numeros iguales, saliendo");
                sw = false;
            }else{
                newVector.add(num);
            }
        }
        
        for (Object object : newVector) {
            System.out.println(object.toString());
        }
    }
    
}
