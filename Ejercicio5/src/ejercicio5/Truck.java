
package ejercicio5;

/**
 *
 * version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Truck extends Vehicle{
    private double height;
    
    public Truck(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, 
               String meansTransport, double height) 
    {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Carro{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport 
                + ", Altura del camión=" + height + '}';
    }
}
