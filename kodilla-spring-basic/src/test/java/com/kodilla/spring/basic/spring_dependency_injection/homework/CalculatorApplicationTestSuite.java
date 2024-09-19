package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorApplicationTestSuite {

    @Test
    public void shouldReturnCorrectAddValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");    // [1]
        Calculator calculator = context.getBean(Calculator.class);  // [2]

        double result = calculator.add(9, 1);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldReturnCorrectSubtractValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);      // chcemy przetestować metody zawarte w Calculator

        double result = calculator.subtract(8, 4);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturnCorrectMultiplyValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void shouldReturnCorrectDivideValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldNotDivideByZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);

        double result = calculator.divide(10, 0);
        Assertions.assertEquals(0, result);
    }
}
