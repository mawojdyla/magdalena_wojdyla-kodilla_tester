package com.kodilla.parametrized_tests;

public class StringManipulator {

    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);       // nowy obiekt klasy
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}


/*
reverse() - odwraca kolejność znaków
toString() - 'builder' jest obiektem, dlatego konieczne jest przekonwenterować obiekt na String,
a następnie można wykonać toLowerCase()

Regex (skrót od regular expressions, czyli wyrażenia regularne) w Javie
to potężne narzędzie służące do przetwarzania tekstu, które pozwala na dopasowywanie,
wyszukiwanie, a także manipulowanie tekstem na podstawie wzorców.
 */