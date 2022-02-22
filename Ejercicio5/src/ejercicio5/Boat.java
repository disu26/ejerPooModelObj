
package ejercicio5;

/**
 * Clase Bote, esta se extiende de la clase vehículo.
 * 
 * version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Boat extends Vehicle{
    private int capacity;
    
    public Boat(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, 
               String meansTransport, int capacity) 
    {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public String toString() {
        return "Lancha{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport 
                + ", Capacidad del bote=" + capacity + '}';
    }
}
