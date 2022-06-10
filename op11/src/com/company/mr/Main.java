package com.company.mr;

import com.company.mr.model.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> manufactures = new ArrayList<>(List.of("Ferrari", "Renault", "Peugeot", "Audi", "BMW"));
        manufactures
                .stream()
                .map(Car::new)
                .sorted(Car::getManufacturerNameComparator)
                .toList()
                .stream()
                .map(Car::getManufacturerName)
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);



    }



}


