package com.company.sb;


import com.company.sb.model.Car;
import com.company.sb.model.Ship;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Car car1 = new Car.CarBuilder().engine("A-engine").price(100).build();
            Car car2 = new Car.CarBuilder().engine("X-engine").price(900).build();
            Car car3 = new Car.CarBuilder().engine("J-engine").price(800).build();
            Car car4 = new Car.CarBuilder().engine("W-engine").price(700).build();
            Car car5 = new Car.CarBuilder().engine("C-engine").price(500).build();

            Car[] cars = {car1, car2, car3, car4, car5};
            Arrays.sort(cars, new Car.CarEngineComparator());

            SortedSet<Car> carSet1 = new TreeSet<>(new Car.CarEngineComparator());
            carSet1.addAll(Set.of(cars));
            carSet1.forEach(System.out::println);

            Ship ship1 = new Ship.ShipBuilder().passengersAmount(100).loadCapacity(93.4).build();
            Ship ship2 = new Ship.ShipBuilder().passengersAmount(800).loadCapacity(39.5).build();
            Ship ship3 = new Ship.ShipBuilder().passengersAmount(600).loadCapacity(133.8).build();
            Ship ship4 = new Ship.ShipBuilder().passengersAmount(200).loadCapacity(172.6).build();
            Ship ship5 = new Ship.ShipBuilder().passengersAmount(900).loadCapacity(66.7).build();

            Ship[] ships = {ship1, ship2, ship3, ship4, ship5};
            Arrays.sort(ships, Ship.getShipLoadCapacityComparator());

            SortedSet<Ship> shipSet = new TreeSet<>(Ship.getShipLoadCapacityComparator());
            shipSet.addAll(Set.of(ships));
            shipSet.forEach(System.out::println);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
