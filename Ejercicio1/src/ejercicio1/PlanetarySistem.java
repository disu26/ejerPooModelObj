
package ejercicio1;

/**
 * Clase abstracta Sistema planetario
 * 
 * @version 1.00.000 2022-02-20
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public abstract class PlanetarySistem {
    public double mass;
    public double density;
    public double diameter;
    public double sunDistancy;
    public String id;
    public String name;

    /**
     * Método para calcular la atracción gravitacional ente dos cuerpos.
     * cuando se hace referencia a "this" se refiere a el objeto que llama el método.
     * @param object1
     * @param distance
     * @return 
     */
    public double gravitationalAtracction(PlanetarySistem object1,double distance){
        return ((6.67408 * Math.pow(10, -11))*((object1.mass*this.mass)/Math.pow(distance, 2)));
    }
    
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSunDistancy() {
        return sunDistancy;
    }

    public void setSunDistancy(double sunDistancy) {
        this.sunDistancy = sunDistancy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
