
package ejercicio5;

/**
 *
 * version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Bike extends Vehicle{
    private String breaks;
    
    public Bike(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, 
               String meansTransport, String breaks) 
    {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
        this.breaks = breaks;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport 
                + ", Tipo de frenos=" + breaks + '}';
    }
}
