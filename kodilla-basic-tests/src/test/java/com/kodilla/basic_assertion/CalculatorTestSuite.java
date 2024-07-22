package com.kodilla.basic_assertion;

import basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5.8;
        double b = 8.3;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-2.5, subtractResult, 0.1);    // // Używamy delty 0.1 dla dokładności
    }

    @Test
    public void testPowerPositive() {
        Calculator calculator = new Calculator();
        double a = 5;
        double powResult = calculator.power(a);
        assertEquals(25, powResult, 0.0);
    }

    @Test
    public void testPowerZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double powResult = calculator.power(a);
        assertEquals(0, powResult, 0.0);
    }

    @Test
    public void testPowerNegative() {
        Calculator calculator = new Calculator();
        double a = -5;
        double powResult = calculator.power(a);
        assertEquals(25, powResult, 0.0);
    }
}
