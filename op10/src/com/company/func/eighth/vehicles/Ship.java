package com.company.func.eighth.vehicles;

import com.company.func.eighth.abstraction.Vehicle;
import com.company.func.eighth.builder.VehicleBuilder;

import java.util.Comparator;

public class Ship extends Vehicle {
    private int passengersAmount;
    private String shipType;
    private double loadCapacity;

    private Ship() {
        super();
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengersAmount=" + passengersAmount +
                ", shipType='" + shipType + '\'' +
                ", loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }

    public static Comparator<Ship> getShipLoadCapacityComparator() {
        return new Comparator<>() {
            @Override
            public int compare(Ship o1, Ship o2) {
                return Double.compare(o1.getLoadCapacity(), o2.getLoadCapacity());
            }
        };
    }

    public static class ShipBuilder implements VehicleBuilder<ShipBuilder> {
        private final Ship ship;

        public ShipBuilder() {
            ship = new Ship();
        }
        public ShipBuilder passengersAmount(int passengersAmount) {
            ship.passengersAmount = passengersAmount;
            return this;
        }
        public ShipBuilder shipType(String shipType) {
            ship.shipType = shipType;
            return this;
        }
        public ShipBuilder loadCapacity(double loadCapacity) {
            ship.loadCapacity = loadCapacity;
            return this;
        }
        @Override
        public ShipBuilder price(int price) {
            return null;
        }

        @Override
        public ShipBuilder maxSpeed(double maximumSpeed) {
            return null;
        }

        @Override
        public ShipBuilder manuName(String manufactureName) {
            return null;
        }

        void validate(Ship ship) {
            if (ship.passengersAmount < 0 || ship.loadCapacity < 0) {
                throw new IllegalStateException("invalid field");
            }
        }

        public Ship build() {
            validate(ship);
            return ship;
        }
    }
}

