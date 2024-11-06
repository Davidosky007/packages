package com.example.vehicle;

/**
 * Class representing a Truck, which is a type of FourWheeler.
 */
public class Truck extends FourWheeler implements Engine, Transmission {
    private int cargoCapacity;

    public Truck(String model, String brand, int numberOfDoors, int cargoCapacity) {
        super(model, brand, numberOfDoors);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public void checkEngineStatus() {
        System.out.println("Checking truck engine status...");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Truck gear changed to " + gear);
    }

    @Override
    public void checkTransmissionStatus() {
        System.out.println("Checking transmission status...");
    }

    @Override
    public void setTransmissionType(String type) {
        System.out.println("Truck transmission type set to: " + type);
    }
}
