package com.calculator.simple;

public class Calculator {
    private double x;
    private double y;
    private double result = 0;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double additionXFromY() {
        return result = x + y;
    }

    public double subtractionXFromY() {
        return result = x - y;
    }

    @Override
    public String toString() {
        return "Wynik wynosi = " + result;
    }
}


