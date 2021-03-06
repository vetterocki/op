package com.company.func;

import com.company.func.eighth.vehicles.Car;
import com.company.func.second.Calculator;
import com.company.func.second.CalculatorPrinter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        try {
            Calculator calculator = ((a, b, c, d) -> 2 * cos(pow(a, b)) + abs(acos(-sqrt(c / d))));
            CalculatorPrinter calculatorPrinter = new CalculatorPrinter();
            calculatorPrinter.printParamsAndResult(calculator, 1, 2, 3, 4);

            Car car1 = new Car.CarBuilder().engine("A-engine").price(100).build();
            Car car2 = new Car.CarBuilder().engine("X-engine").price(900).build();
            Car car3 = new Car.CarBuilder().engine("J-engine").price(800).build();
            Car car4 = new Car.CarBuilder().engine("W-engine").price(700).build();
            Car car5 = new Car.CarBuilder().engine("C-engine").price(500).build();

            List<Car> carList = new ArrayList<>(List.of(car1, car2, car3, car4, car5));
            carList.forEach(System.out::println);



        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }
}


