package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    void testAddTransaction() {     // Sprawdza, czy transakcje są poprawnie dodawane i czy metoda getNumberOfTransactions zwraca poprawną liczbę transakcji.
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);

        assertEquals(2, cashMachine.getNumberOfTransactions());
        assertArrayEquals(new int[]{200, -100}, cashMachine.getTransactions());
    }

    @Test
    void testGetBalance() {     // Sprawdza, czy metoda getBalance poprawnie oblicza saldo
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);

        assertEquals(100, cashMachine.getBalance());
    }

    @Test
    void testGetNumberOfTransactions() {            // Sprawdza, czy poprawnie zwraca liczbę transakcji.
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);

        assertEquals(2, cashMachine.getNumberOfTransactions());

    }

    @Test
    void testEmptyCashMachine() {       // Sprawdza, czy nowo utworzony obiekt CashMachine ma początkowe saldo 0, 0 transakcji i pustą tablicę transakcji.
        CashMachine cashMachine = new CashMachine();

        assertEquals(0, cashMachine.getBalance());
        assertEquals(0, cashMachine.getNumberOfTransactions());
        assertArrayEquals(new int[]{}, cashMachine.getTransactions());
    }


}
