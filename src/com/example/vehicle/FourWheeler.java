package com.example.vehicle;

/**
 * Abstract class for vehicles with four wheels.
 */
public abstract class FourWheeler extends Vehicle {
    private int numberOfDoors;

    public FourWheeler(String model, String brand, int numberOfDoors) {
        super(model, brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Additional functionality can be added here
}
