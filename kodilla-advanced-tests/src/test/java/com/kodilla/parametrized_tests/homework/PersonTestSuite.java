package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMISources#provideDataForBMI")
    public void shouldCalculateCorrectBMI(double height, double weight, String expectedBMI) {
        // given
        Person person = new Person(height, weight);

        // when
        String actualBMI = person.getBMI();

        // then
        assertEquals(expectedBMI, actualBMI);
    }
}
