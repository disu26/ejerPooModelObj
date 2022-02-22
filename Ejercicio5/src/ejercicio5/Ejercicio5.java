
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio #5, con el ejemplo anterior, usar la herencia y diferenciar 
 * entre coche,moto,camión,bicicleta y lancha. 
 * 
 * @version 1.00.000 2022-02-21
 * @author Dímar Andrey Suárez Hidalgo - dimar260212@gmail.com
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Car newCar;
        Moto newMoto;
        Truck newTruck;
        Bike newBike;
        Boat newBoat;
        int passengersNum;
        String tripulatedString;
        boolean tripulated = false;
        int wheelsNum;
        String enrollmentDate;
        String meansTransport;
        String doorsString;
        boolean doors = false;
        String displacement;
        double height;
        String breaks;
        int capacity;
        int option;
        
        /**
         * Ciclo para ingresar los 10 datos de los vehiculos
         */
        for (int i = 0; i < 10; i++) {
            /**
             * Se pregunta qué tipo de vehiculo se desea crear.
             */
            System.out.println("Tipo de vehiculo");
            System.out.println("1.Carro");
            System.out.println("2.Moto");
            System.out.println("3.Camión");
            System.out.println("4.Bicicleta");
            System.out.println("5.Bote");
            option = read.nextInt();
            
            /**
             * Se pide la información general de cualquier vehículo.
             */
            System.out.println("Número de pasajeros del vehículo: ");
            passengersNum = read.nextInt();
            System.out.println("¿Vehiculo con pasajeros? [si,no]: ");
            tripulatedString = read.next();
            switch (tripulatedString) {
                case "si":
                    tripulated = true;
                    break;
                case "no":
                    tripulated = false;
                    break;
                default:
                    System.out.println("opción incorrecta");
                    break;
            }
            System.out.println("Número de ruedas: ");
            wheelsNum = read.nextInt();
            System.out.println("Fecha de matriculación [aaaa-mm-dd]: ");
            enrollmentDate = read.next();
            System.out.println("Medio por el que se desplaza: ");
            meansTransport = read.next();  
            
            switch (option) {
                /**
                 * Se capturan los diferentes atributos únicos de cada case.
                 */
                case 1:
                    System.out.println("¿El carro tiene 3 puertas? [si,no]: ");
                    doorsString = read.next();
                    switch (doorsString) {
                        case "si":
                            doors = true;
                            break;
                        case "no":
                            doors = false;
                            break;
                        default:
                            System.out.println("opción incorrecta");
                            break;
                    }
                    newCar = new Car(passengersNum, tripulated, wheelsNum, 
                                     enrollmentDate, meansTransport, doors);
                    vehicleList.add(newCar);
                    break;
                case 2:
                    System.out.println("Cilindraje de la moto: ");
                    displacement = read.next();
                    newMoto = new Moto(passengersNum, tripulated, wheelsNum, 
                                       enrollmentDate, meansTransport, displacement);
                    vehicleList.add(newMoto);
                    break;
                case 3:
                    System.out.println("Altura del camión: ");
                    height = read.nextDouble();
                    newTruck = new Truck(passengersNum, tripulated, wheelsNum, 
                                         enrollmentDate, meansTransport, height);
                    vehicleList.add(newTruck);
                    break;
                case 4:
                    System.out.println("Tipo de frenos: ");
                    breaks = read.next();
                    newBike = new Bike(passengersNum, tripulated, wheelsNum, 
                                        enrollmentDate, meansTransport, breaks);
                    vehicleList.add(newBike);
                    break;
                case 5:
                    System.out.println("Capacidad de la lancha: ");
                    capacity = read.nextInt();
                    newBoat= new Boat(passengersNum, tripulated, wheelsNum, 
                                        enrollmentDate, meansTransport, capacity);
                    vehicleList.add(newBoat);
                    break;
                default:
                    throw new AssertionError();
            }
            
        }
        
        /**
         * Ciclo para mostrar los vehiculos.
         */
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }
    }
}
  
