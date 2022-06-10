package com.company.func.second;

@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b, double c, double d);

    default double calculateExpression(double a, double b, double c, double d) {
        return a * b * c * d;
    }

    static double calculateExpressionStatic(double a, double b, double c, double d) {
        return a * b * c * d + 10;
    }
}
