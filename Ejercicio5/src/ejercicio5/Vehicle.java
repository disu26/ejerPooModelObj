
package ejercicio5;

/**
 *
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public abstract class Vehicle {
    public int passengersNum;
    public boolean tripulated;
    public int wheelsNum;
    public String enrollmentDate;
    public String meansTransport;

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
    
    @Override
    public String toString() {
        return "Vehículo{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport + '}';
    }
}
