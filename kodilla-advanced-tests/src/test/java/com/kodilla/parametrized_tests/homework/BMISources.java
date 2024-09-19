package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {
    static Stream<Arguments> provideDataForBMI() {
        return Stream.of(
                Arguments.of(1.80, 52, "Underweight"),
                Arguments.of(1.80, 60, "Normal (healthy weight)"),
                Arguments.of(1.60, 80, "Obese Class I (Moderately obese)"),
                Arguments.of(1.63, 135, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 49, "Underweight"),
                Arguments.of(1.70, 130, "Obese Class III (Very severly obese)"),
                Arguments.of(1.85, 160, "Obese Class IV (Morbidly obese)"),
                Arguments.of(1.69, 35, "Very severly underweight"),
                Arguments.of(1.58, 58, "Normal (healthy weight)"),
                Arguments.of(1.55, 71, "Overweight")
        );

    }
}
