package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {      // pętla nieskończona dopóki użytkownik nie wprowadzi poprawnych danych
            System.out.println("Enter number of rounds:");
            String s = scanner.nextLine();              // odczytuje linię tekstu wpisaną przez użytkownika
            try {
                int rounds = Integer.parseInt(s);       // konwersja odczytanego ciągu 's' na liczbe całkowitą
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits. Try again.");
            }
        }
    }
}
