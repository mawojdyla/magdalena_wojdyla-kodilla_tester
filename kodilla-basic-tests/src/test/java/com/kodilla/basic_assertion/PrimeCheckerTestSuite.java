package com.kodilla.basic_assertion;

import basic_assertion.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {                // przypadki brzegowe: 0, 1, 2 i liczby ujemne
    private PrimeChecker checker = new PrimeChecker();

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        checker.incrementCount();
        boolean result = checker.isPrime(14);   // Liczba 14 nie jest liczbą pierwszą, ponieważ ma więcej niż dwa dzielniki (1, 2, 7, 14).
        System.out.println("Test number " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {      // dzielniki 1 i 13
        checker.incrementCount();
        boolean result = checker.isPrime(13);
        System.out.println("Test number " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {  // dzielniki 1 i 2
        checker.incrementCount();
        boolean result = checker.isPrime(2);
        System.out.println("Test number " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {     // jeden dzielnik 1; jest to przypadek brzegowy
        checker.incrementCount();
        boolean result = checker.isPrime(1);
        System.out.println("Test number " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {    // ma nieskończoną liczbę dzielników
        checker.incrementCount();
        boolean result = checker.isPrime(0);
        System.out.println("Test number " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {  // to liczba ujemna, a liczby pierwsze muszą być większe od 1;
        checker.incrementCount();                                 // jest to przypadek brzegowy, bo liczba jest ujemna
        boolean result = checker.isPrime(-6);
        System.out.println("Test number " + checker.getCount());
        assertFalse(result);
    }
}

