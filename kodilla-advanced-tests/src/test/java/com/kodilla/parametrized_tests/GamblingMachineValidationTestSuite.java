package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineValidationTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    // isNotCorrectSize()

    @Test
    public void shouldReturnTrueWhenSetHasLessThan6Numbers() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);

        // When
        boolean result = gamblingMachine.isNotCorrectSize(userNumbers);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenSetHasMoreThan6Numbers() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        for (int i = 1; i <= 7; i++) {
            userNumbers.add(i);
        }

        // When
        boolean result = gamblingMachine.isNotCorrectSize(userNumbers);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenSetHasExactly6Numbers() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        for (int i = 1; i <= 6; i++) {
            userNumbers.add(i);
        }

        // When
        boolean result = gamblingMachine.isNotCorrectSize(userNumbers);

        // Then
        Assertions.assertFalse(result);
    }

    //isAnyNumberOutOfDeclareScope

    @Test
    public void shouldReturnTrueWhenAnyNumberIsLessThan1() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(0);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);
        userNumbers.add(6);

        // When
        boolean result = gamblingMachine.isAnyNumberOutOfDeclareScope(userNumbers);

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenAnyNumberIsGreaterThan49() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);
        userNumbers.add(50);

        // When
        boolean result = gamblingMachine.isAnyNumberOutOfDeclareScope(userNumbers);

        // Then
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldReturnFalseWhenAllNumbersAreWithinRange() {
        // Given
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);
        userNumbers.add(6);

        // When
        boolean result = gamblingMachine.isAnyNumberOutOfDeclareScope(userNumbers);

        // Then
        Assertions.assertFalse(result);
    }

    // validateNumbers()

    @Test
    void validateNumbers_throwsExceptionWhenSizeIsIncorrect() {
        // Przykład zestawu liczb o nieprawidłowym rozmiarze
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);  // Dodajemy tylko 2 liczby, ale może wymagana jest większa ilość, np. 6

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(numbers));
    }

    @Test
    void validateNumbers_throwsExceptionWhenNumberOutOfScope() {
        // Przykład zestawu liczb, gdzie jedna liczba jest poza zakresem
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(100);  // Liczba poza deklarowanym zakresem (np. zakres to 1-49)

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(numbers));
    }

    @Test
    void validateNumbers_doesNotThrowExceptionWhenInputIsValid() {
        // Przykład poprawnego zestawu liczb
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        assertDoesNotThrow(() -> gamblingMachine.validateNumbers(numbers));
    }
}


