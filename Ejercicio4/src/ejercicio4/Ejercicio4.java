
package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio #4, control de un ferry.
 * 
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Vehicle newVehicle;
        int passengersNum;
        String tripulatedString;
        boolean tripulated = false;
        int wheelsNum;
        String enrollmentDate;
        String meansTransport;
        
        /**
         * Ciclo para ingresar los 10 datos de los vehiculos
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Número de pasajeros del vehículo: ");
            passengersNum = read.nextInt();
            System.out.println("¿Vehiculo con pasajeros? [si,no]: ");
            tripulatedString = read.next();
            if (tripulatedString.equals("si")) {
                tripulated = true;
            }else if(tripulatedString.equals("no")){
                tripulated = false;
            }else{
                System.out.println("opción incorrecta");
            }
            System.out.println("Número de ruedas: ");
            wheelsNum = read.nextInt();
            System.out.println("Fecha de matriculación [aaaa-mm-dd]: ");
            enrollmentDate = read.next();
            System.out.println("Medio por el que se desplaza: ");
            meansTransport = read.next();  
            
            newVehicle = new Vehicle(passengersNum, tripulated, wheelsNum, 
                                     enrollmentDate, meansTransport);
            
            vehicleList.add(newVehicle);
        }
        
        /**
         * Ciclo para mostrar los vehiculos.
         */
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }
    }
    
}
