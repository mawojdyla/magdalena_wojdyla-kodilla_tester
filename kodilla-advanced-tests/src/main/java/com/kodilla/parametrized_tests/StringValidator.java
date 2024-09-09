package com.kodilla.parametrized_tests;

public class StringValidator {

    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}

/*
null - czy jest to niezainicjalizowana wartość;
text.trim(): Metoda trim() usuwa wszelkie białe znaki (spacje, tabulacje, itp.) na początku i końcu ciągu znaków.
text.trim().isEmpty(): Sprawdza, czy ciąg znaków (po usunięciu białych znaków) jest pusty,
 czyli czy jego długość wynosi 0. Jeśli jest pusty, metoda zwróci true.
 */
