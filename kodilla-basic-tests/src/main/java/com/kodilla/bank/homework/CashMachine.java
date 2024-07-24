package com.kodilla.bank.homework;

public class CashMachine {      // to definicja bankomatu z inf o transakcjach/ transactions array (dodatnie- wpłaty, ujemne wypłaty)
    private int[] transactions;     //tablica z wszystkimi transakcjami
    private int size;       //liczba transakcji

    public CashMachine() {          // Konstruktor klasy CashMachine. Inicjalizuje tablicę transactions jako pustą.
        this.transactions = new int[0];
        this.size = 0;              // reprezentuje aktualny rozmiar tablicy
    }

    public void addTransaction(int amount) {             // Metoda dodaje nową transakcję do tablicy
        this.size++;                                    // Zwiększa rozmiar tablicy o 1 transakcję
        int[] newTransactions = new int[this.size];     // nowa tablica 'newTransactions' o rozmiarze 'this.size', czyli o jeden element większa niż poprzednia 'transactions'.

        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length); // kopiuje stare transakcje do nowej tablicydodaje nową transakcję i przypisuje nową tablicę do transactions.
        newTransactions[this.size - 1] = amount;        // [this.size - 1] to indeks ostatniego elementu
        this.transactions = newTransactions;            // uaktualnia 'transactions' w obiekcie 'CashMachine'
    }

    public int getBalance() {       // saldo bankomatu, sumuje wszystkie (różnica) wpływy-wypływy
        int balance = 0;
        for (int transaction : transactions) {  // for (int i = 0; i < transactions.length; i++) { int transaction = transactions[i]; ...}
            balance += transaction;     // balance = balance + transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {        // zwraca liczbę wykonanych transakcji
        return transactions.length;
    }

    public int[] getTransactions() {        // zwraca tablicę transakcji
        return transactions;            // metoda dostępowa, która umożliwia uzyskanie dostępu do prywatnego pola transactions z zewnątrz klasy CashMachine.
    }
}

