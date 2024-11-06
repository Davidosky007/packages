package com.example.vehicle;

/**
 * Class representing a Car, which is a type of FourWheeler.
 */
public class Car extends FourWheeler implements Engine, Transmission, AirConditioning {
    private String fuelType;

    public Car(String model, String brand, int numberOfDoors, String fuelType) {
        super(model, brand, numberOfDoors);
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void checkEngineStatus() {
        System.out.println("Checking car engine status...");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Car gear changed to " + gear);
    }

    @Override
    public void checkTransmissionStatus() {
        System.out.println("Checking transmission status...");
    }

    @Override
    public void setTransmissionType(String type) {
        System.out.println("Car transmission type set to: " + type);
    }

    @Override
    public void turnOnAC() {
        System.out.println("Car AC turned on.");
    }

    @Override
    public void turnOffAC() {
        System.out.println("Car AC turned off.");
    }

    @Override
    public void setACTemperature(int temperature) {
        System.out.println("Car AC temperature set to " + temperature);
    }
}
