
package ejercicio1;

/**
 * Ejerccio #1, Abstracción de un sistema planetario.
 * 
 * @version 1.00.000 2022-02-20
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        PlanetarySistem mars = new Planet(156548499,155148984,233545646,1564656,
                                              "10","Marte");
        
        PlanetarySistem moon = new Star(23456545,10568898,145657887,1466479,
                                              "20","Luna Terrestre");
        double distance = 1354984895;
        
        System.out.println("La distancia entre "+moon.getName()+" y "+mars.getName()+
                            " es "+mars.gravitationalAtracction(moon, distance));
    }
    
}
