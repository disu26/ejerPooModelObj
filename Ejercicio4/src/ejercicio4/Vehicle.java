
package ejercicio4;

/**
 *
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Vehicle {
    private int passengersNum;
    private boolean tripulated;
    private int wheelsNum;
    private String enrollmentDate;
    private String meansTransport;

    public Vehicle(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, String meansTransport) {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
    }

    public int getPassengersNum() {
        return passengersNum;
    }

    public void setPassengersNum(int passengersNum) {
        this.passengersNum = passengersNum;
    }

    public boolean isTripulated() {
        return tripulated;
    }

    public void setTripulated(boolean tripulated) {
        this.tripulated = tripulated;
    }

    public int getWheelsNum() {
        return wheelsNum;
    }

    public void setWheelsNum(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getMeansTransport() {
        return meansTransport;
    }

    public void setMeansTransport(String meansTransport) {
        this.meansTransport = meansTransport;
    }

    /**
     * Método para mostrar los datos correctamente en un array.
     * @return 
     */
    @Override
    public String toString() {
        return "Vehículo{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport + '}';
    }
    
    
}
