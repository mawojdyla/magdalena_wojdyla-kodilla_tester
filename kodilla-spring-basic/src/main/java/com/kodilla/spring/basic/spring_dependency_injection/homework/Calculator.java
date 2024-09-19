package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    @Autowired      // wstrzykiwanie zależności przez konstruktor
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        double result = a / b;
        display.display(result);
        return result;
    }
}
