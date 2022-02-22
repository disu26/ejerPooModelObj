
package ejercicio5;

/**
 * Clase carro, esta se extiende de la clase vehiculo e incluye atributos propias.
 * 
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Car extends Vehicle{
    private int doorsInt;

    public Car(int passengersNum, boolean tripulated, int wheelsNum, String enrollmentDate, 
               String meansTransport, boolean doors) 
    {
        this.passengersNum = passengersNum;
        this.tripulated = tripulated;
        this.wheelsNum = wheelsNum;
        this.enrollmentDate = enrollmentDate;
        this.meansTransport = meansTransport;
        /**
         * Se pregunta si la puerta es de 3 puertas, de lo contrario es de 5.
         */
        if (doors) {
            doorsInt = 3;
        }else{
            doorsInt = 5;
        }
    }

    public void setDoorsInt(boolean doors) {
        if (doors) {
            doorsInt = 3;
        }else{
            doorsInt = 5;
        }
    }
    
    
    public int getDoorsInt() {
        return doorsInt;
    }

    @Override
    public String toString() {
        return "Carro{" + "Número de pasajeros=" + passengersNum + ", Vehículo con pasajeros=" 
                + tripulated + ", Número de ruedas=" + wheelsNum + ", Fecha de matriculación=" 
                + enrollmentDate + ", Medio por el que se desplaza=" + meansTransport 
                + ", Cantidad de puertas=" + doorsInt + '}';
    }
    
    
}
