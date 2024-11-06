package com.example.vehicle;

/**
 * Class representing a Motorcycle, which is a type of TwoWheeler.
 */
public class Motorcycle extends TwoWheeler implements Engine, FuelType {
    private int engineCapacity;

    public Motorcycle(String model, String brand, boolean hasCarrier, int engineCapacity) {
        super(model, brand, hasCarrier);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }

    @Override
    public void checkEngineStatus() {
        System.out.println("Checking motorcycle engine status...");
    }

    @Override
    public void setFuelType(String fuelType) {
        System.out.println("Fuel type set to: " + fuelType);
    }

    @Override
    public String getFuelType() {
        return "Motorcycle fuel type";
    }

    @Override
    public void refuel() {
        System.out.println("Motorcycle refueled.");
    }
}
