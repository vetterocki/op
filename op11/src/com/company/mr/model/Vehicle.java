package com.company.mr.model;

public abstract class Vehicle {
    protected int price;
    protected double maximumSpeed;
    protected String manufacturerName;

    public Vehicle() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", maximumSpeed=" + maximumSpeed +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}


