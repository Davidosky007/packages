package com.example.vehicle;

/**
 * Interface defining transmission-related functionalities.
 */
public interface Transmission {
    void changeGear(int gear);
    void checkTransmissionStatus();
    void setTransmissionType(String type);
}
