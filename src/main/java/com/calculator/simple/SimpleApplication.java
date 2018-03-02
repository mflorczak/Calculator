package com.calculator.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);

		/*int n;
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
        }*/
	}
}
