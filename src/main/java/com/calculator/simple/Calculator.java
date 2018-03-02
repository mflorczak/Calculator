package com.calculator.simple;

import java.util.Scanner;

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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String [] args) {
        int n;
        System.out.println("Dodawanie wybierz 1\nOdejmowanie wybierz 2");
        try (Scanner in = new Scanner(System.in)) {
            n = in.nextInt();
        }

        switch (n) {
            case 1:
                Calculator calculator = new Calculator(10, 5);
                calculator.additionXFromY();
                System.out.println(calculator);
                break;
            case 2:
                calculator = new Calculator(10, 31);
                calculator.subtractionXFromY();
                System.out.println(calculator);
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
    }
}



