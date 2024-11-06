package com.example.vehicle;

/**
 * Abstract class for vehicles with two wheels.
 */
public abstract class TwoWheeler extends Vehicle {
    private boolean hasCarrier;

    public TwoWheeler(String model, String brand, boolean hasCarrier) {
        super(model, brand);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    public void setCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    // Additional functionality can be added here
}
