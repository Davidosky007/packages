package com.example.vehicle;

/**
 * Interface for vehicles specifying fuel type.
 */
public interface FuelType {
    void setFuelType(String fuelType);
    String getFuelType();
    void refuel();
}
