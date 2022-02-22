
package ejercicio5;

/**
 * Clase moto, esta se extiende de la clase vehículo.
 * 
 * version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Moto extends Vehicle{
    private String displacement;
    
    public Moto(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, 
               String meansTransport, String displacement) 
    {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
        this.displacement = displacement;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }
    
    @Override
    public String toString() {
        return "Moto{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport 
                + ", Cilindraje=" + displacement + '}';
    }
}
