package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
//    @CsvSource(value = {"test,tset", "Other,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

//    @ParameterizedTest
//    @MethodSource(value = "provideStringsForTestingLength")
//    public void shouldCalculateStringLengthWithoutSpaces(String input, String expected) {
//        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
//    }

//    private static Stream<Arguments> provideStringsForTestingLength() {
//        return Stream.of(
//                Arguments.of("test", 4),
//                Arguments.of("OtHEr ", 5),
//                Arguments.of("E V e n t", 5),
//                Arguments.of("null ", 4),
//                Arguments.of("A", 1)
//        );
//    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"'te,st':1", "'..OtHEr ':0", "'E,V,e,n.t':3", "'null ':0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfCommas(input));
    }
}




/*

@CsvSource - adnotacja przyjmuje tablicę Stringów

':' - delimiter typu char;

numLinesToSkip określa, ile wierszy liczonych od góry powinno być pominiętych
przy odczytywaniu wartości.
Zazwyczaj stosujemy wartość 1 – w pliku CSV często tworzy się tzw. header
(pol. nagłówek – pierwszy wiersz z wymienionymi nazwami "kolumn").
-----------------------------------------------------------------------------
Wartość value z @MethodSource możemy pominąć, ale konieczne wtedy jest
nazwanie metody produkującej dane tak samo, jak metody testującej. W
naszym przypadku wyglądałoby to w ten sposób:

@ParameterizedTest
@MethodSource
public void shouldCalculateStringLengthWithoutSpaces(String input,
int expected) {
assertEquals(expected,
manipulator.getStringLengthWithoutSpaces(input));
}
private static Stream<Arguments>
shouldCalculateStringLengthWithoutSpaces() {
return Stream.of(
Arguments.of("test", 4),
Arguments.of("OtHEr ", 5),
Arguments.of("E V e n t", 5),
Arguments.of("null ", 4),
Arguments.of("A", 1)
);
}


 */