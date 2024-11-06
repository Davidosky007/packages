package com.example.vehicle;

/**
 * Abstract class representing a generic vehicle.
 */
public abstract class Vehicle {
    private String model;
    private String brand;

    // Constructor
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Abstract method to be implemented by subclasses
    public abstract void startEngine();
}
