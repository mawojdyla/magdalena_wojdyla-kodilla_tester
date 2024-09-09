package com.kodilla.parametrized_tests;

public class Solution {
    public static void main(String[] args) {
        int suma1 = sumaTablicy(new int[]{1, 2, 3, 4, 10, 11});
        int suma2 = sumaTablicy(new int[]{338, 65, 713, 595, 428, 610, 728, 573, 871, 868});

        if(suma1 == 31 && suma2 == 5789) {
            System.out.println("Suma została obliczona poprawnie");
        } else {
            System.out.println("Suma została obliczona błędnie");
        }
        long sumaDuzych1 = sumaDuzychLiczb(new long[]{1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l});
        long sumaDuzych2 = sumaDuzychLiczb(new long[]{10000000000l, 20000000000l, 30000000000l, 1000000004l, 1000000005l});

        if(sumaDuzych1 == 5000000015l && sumaDuzych2 == 62000000009l) {
            System.out.println("Suma dużych liczb została obliczona poprawnie");
        } else {
            System.out.println("Suma dużych liczb została obliczna błędnie");
        }

        int pair1 = numberOfPairs(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        int pair2 = numberOfPairs(new int[]{20, 20});
        int pair3 = numberOfPairs(new int[]{10, 20, 30, 40, 50});
        if(pair1 == 3 && pair2 == 1 && pair3 == 0) {
            System.out.println("Znaleziono poprawną liczbę par");
        } else {
            System.out.println("Znaleziono błędną liczbę par");
        }
    }

    private static Integer sumaTablicy(int[] array) {
        return 0;
    }

    private static Long sumaDuzychLiczb(long[] array) {
        return 0l;
    }

    private static Integer numberOfPairs(int[] array) {
        //w argumencie metoda przyjmuje tablicę liczb
        //wyświetl/zwróć liczbę par znajduje się w tablicy
        //przykład 1: tablica zawiera: 10, 10, 20, wynik: w tablicy znajduje się jedna para
        //przykład 2: tablica zawiera: 10, 20, 30, wynik: w tablicy nie znajduje się żadna para
        //przykład 3: tablica zawiera: 20, 20, 30, 40, 20, wynik: w tablicy znajduje się jedna para

        return 0;

    }
}