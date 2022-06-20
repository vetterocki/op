package com.company.func.second;

import static java.lang.Math.*;

public class CalculatorPrinter {

    public void printParamsAndResult(Calculator calculator, double a, double b, double c, double d) {
        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
        System.out.println(calculator.calculate(a, b, c, d));
    }
}
