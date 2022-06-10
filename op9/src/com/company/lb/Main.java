package com.company.lb;

import com.company.lb.model.Car;
import com.company.lb.model.Ship;
import com.company.lb.util.Vehicles;

public class Main {

    public static void main(String[] args) {
        try {
            Car car1 = new Car.CarBuilder().seats(4).engine("A-Type").build();
            Car car2 = new Car.CarBuilder().seats(2).engine("C-Type").build();
            Car car3 = new Car.CarBuilder().seats(3).engine("X-Type").build();
            Car car4 = new Car.CarBuilder().seats(5).engine("Y-Type").build();
            Car car5 = new Car.CarBuilder().seats(6).engine("T-Type").build();

            Vehicles.getVehiclesSortedSet(Car.getCarSeatsReversedComparator(), car1, car2, car3, car4, car5)
                    .forEach(System.out::println);

            Ship ship1 = new Ship.ShipBuilder().passengersAmount(100).loadCapacity(93.4).build();
            Ship ship2 = new Ship.ShipBuilder().passengersAmount(800).loadCapacity(39.5).build();
            Ship ship3 = new Ship.ShipBuilder().passengersAmount(600).loadCapacity(133.8).build();
            Ship ship4 = new Ship.ShipBuilder().passengersAmount(200).loadCapacity(172.6).build();
            Ship ship5 = new Ship.ShipBuilder().passengersAmount(900).loadCapacity(66.7).build();

            Vehicles.getVehiclesSortedSet(Ship.getShipPassengersComparator(), ship1, ship2, ship3, ship4, ship5)
                    .forEach(System.out::println);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
