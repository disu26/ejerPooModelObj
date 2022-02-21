
package ejercicio1;

/**
 * Clase estrella, esta se extiende de la clase abastracta sistema planetario.
 * 
 * @version 1.00.000 2022-02-20
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Star extends PlanetarySistem{
    
    /**
     * Constructor para la clase estrella, los atributos se extienden de la clase abstracta.
     * @param mass
     * @param density
     * @param diameter
     * @param sunDistancy
     * @param id
     * @param name 
     */
    public Star(double mass, double density, double diameter, double sunDistancy, String id, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistancy = sunDistancy;
        this.id = id;
        this.name = name;
    }
}
