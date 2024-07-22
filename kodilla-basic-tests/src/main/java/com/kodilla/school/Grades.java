package com.kodilla.school;

public class Grades {

    private int[] values;
    private int size;           // liczba elementów w tablicy 'values'

    public Grades() {       // Konstruktor, inicjalizuje size na 0 i values jako pustą tablicę
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {        // metoda dodaje nową ocenę do tablicy 'values'
        this.size++;        // zwiększa rozmiar tablicy o 1
        int[] newTab = new int[this.size];      // nowa tablica o rozmiarze size,
        System.arraycopy(values, 0, newTab, 0, values.length);  // kopiuje zawartość starej tablicy 'values' do nowej tablicy 'newTab'
        newTab[this.size - 1] = value; // dodaje nową wartość/ocenę na koniec nowej tablicy
        this.values = newTab;       // tymczasowa tablica używana w metodzie 'add' do przechowywania ocen, zanim zostanie przypisana do 'this.values'

    }

    public int[] getValues() {      // metoda zwraca tablicę 'values'
        return values;
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;                                  // zmienna sumująca wszystkie oceny
        for (int i = 0; i < this.values.length; i++) {      // pętla sumuje wszystkie oceny
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}
