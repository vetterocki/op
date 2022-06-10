package com.company.lb.builder;

public interface VehicleBuilder<T> {
    T price(int price);
    T maxSpeed(double maximumSpeed);
    T manuName(String manufactureName);
}
