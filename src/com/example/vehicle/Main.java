// File: src/com/example/vehicle/Main.java
package com.example.vehicle;

/**
 * Main class to test the vehicle classes and interfaces.
 */
public class Main {
    public static void main(String[] args) {
        // Create instances of Car, Truck, and Motorcycle
        Car car = new Car("Model S", "Tesla", 4, "Electric");
        Truck truck = new Truck("F-150", "Ford", 2, 10000);
        Motorcycle motorcycle = new Motorcycle("CB500F", "Honda", true, 500);

        // Call methods on each instance to demonstrate functionality
        car.startEngine();
        car.changeGear(2);
        car.turnOnAC();
        
        truck.startEngine();
        truck.changeGear(3);

        motorcycle.startEngine();
        motorcycle.refuel();

        // Print some properties using getters
        System.out.println("Car model: " + car.getModel());
        System.out.println("Truck cargo capacity: " + truck.getCargoCapacity());
        System.out.println("Motorcycle engine capacity: " + motorcycle.getEngineCapacity());
    }
}
