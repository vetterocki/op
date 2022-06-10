package com.company.lb.model;

import com.company.lb.builder.VehicleBuilder;

import java.util.Comparator;

public class Car extends Vehicle {

    private int seats;
    private String transmission;
    private String engine;
    private double fromZeroToHundredSeconds;

    private Car() {
        super();
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getFromZeroToHundredSeconds() {
        return fromZeroToHundredSeconds;
    }

    public void setFromZeroToHundredSeconds(double fromZeroToHundredSeconds) {
        this.fromZeroToHundredSeconds = fromZeroToHundredSeconds;
    }

    public static Comparator<Car> getCarSeatsComparator() {
        return Comparator.comparingInt(Car::getSeats);
    }

    public static Comparator<Car> getCarSeatsReversedComparator() {
        return Comparator.comparingInt(Car::getSeats).reversed();
    }


    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", transmission='" + transmission + '\'' +
                ", engine='" + engine + '\'' +
                ", fromZeroToHundredSeconds=" + fromZeroToHundredSeconds +
                ", " + super.toString();
    }

    public static class CarEngineComparator implements Comparator<Car> {
        @Override
        public int compare(Car c1, Car c2) {
            return c1.getEngine().compareTo(c2.getEngine());
        }
    }

    public static class CarBuilder implements VehicleBuilder<CarBuilder> {
        private final Car car;

        public CarBuilder() {
            car = new Car();
        }

        public CarBuilder fromZeroToHundred(double fromZeroToHundred) {
            car.fromZeroToHundredSeconds = fromZeroToHundred;
            return this;
        }
        public CarBuilder transmission(String transmission) {
            car.transmission = transmission;
            return this;
        }
        public CarBuilder engine(String engine) {
            car.engine = engine;
            return this;
        }
        public CarBuilder seats(int seats) {
            car.seats = seats;
            return this;
        }
        @Override
        public CarBuilder price(int price) {
            car.setPrice(price);
            return this;
        }

        @Override
        public CarBuilder maxSpeed(double maximumSpeed) {
            car.setMaximumSpeed(maximumSpeed);
            return this;
        }

        @Override
        public CarBuilder manuName(String manufactureName) {
            car.setManufacturerName(manufactureName);
            return this;
        }
        void validate(Car car) {
            if (car.fromZeroToHundredSeconds < 0 || car.getMaximumSpeed() < 0 || car.seats < 0) {
                throw new IllegalStateException("invalid field");
            }
        }
        public Car build() {
            validate(car);
            return car;
        }

    }
}



