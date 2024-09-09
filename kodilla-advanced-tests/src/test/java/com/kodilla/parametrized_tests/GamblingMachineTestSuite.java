package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 0)
    public void shouldCountHowManyWins(String input) throws InvalidNumbersException {   // ile trafionych liczb z 6
        // Przekształcenie wejścia z CSV na Set<Integer>
        Set<Integer> userNumbers = convertStringToSet(input);
        int result = gamblingMachine.howManyWins(userNumbers);
        Assertions.assertTrue(result >= 0 && result <= 6);
}


    private Set<Integer> convertStringToSet(String input) {
        String[] numbersArray = input.split(",");   // split(",") dzieli w miejscu każdego przecinka ciąg na pojedyncze stringi
        Set<Integer> resultSet = new HashSet<>();       // tworzymy pusty zbiór liczb całkowitych, (Set nie przechowuje duplikatów)
        for (String number : numbersArray) {
            resultSet.add(Integer.parseInt(number.trim()));     // przekształcenie String na Integer, trim() usuwa białe znaki
        }
        return resultSet;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalid-data-test.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionForOutOfRangeOrInvalidSizeNumbers(String input) {
        Set<Integer> userNumbers = convertStringToSet(input);

        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(userNumbers);
        });

    }
}



/*
dane z pliku CSV są wczytywane jako tekst (String).
Każdy wiersz pliku CSV jest przekazywany do testu
jako jeden argument typu String. W przypadku naszego przykładu,
wiersze pliku CSV zawierają liczby oddzielone przecinkami, np. 5,10,15,20,25,35.
----------------------------------------------------------
Integer.parseInt(number.trim()) przekształca String na Integer.
trim() usuwa wszelkie białe znaki (spacje, tabulacje, nowe linie) przed i po liczbie, aby upewnić się, że nie ma błędów podczas konwersji.
----------------------------------------------------------


 */