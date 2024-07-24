package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    void addCashMachine() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(0, bank.getTotalDepositTransactions());
    }

// Ten test tworzy instancje klasy Bank i CashMachine, dodaje dwa bankomaty do banku
// i sprawdza liczbę transakcji wpłat. Początkowo nie ma żadnych transakcji,
// więc liczba wpłat powinna być 0.


    @Test
    void testGetTotalBalance() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(350, bank.getTotalBalance());
    }

    // Ten test sprawdza, czy metoda getTotalBalance poprawnie sumuje saldo z dwóch bankomatów

    @Test
    void testGetTotalDepositTransactions() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(2,bank.getTotalDepositTransactions());
    }
    // Ten test sprawdza, czy metoda getTotalDepositTransactions poprawnie liczy liczbę transakcji wpłat (dodatnie wartości).

    @Test
    void testGetTotalWithdrawalTransactions() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(2, bank.getTotalWithdrawalTransactions());
    }

    // Ten test sprawdza, czy metoda getTotalWithdrawalTransactions poprawnie liczy liczbę transakcji wypłat (ujemne wartości).

    @Test
    void testGetAverageDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(250.0, bank.getAverageDeposit());
    }
    // Ten test sprawdza, czy metoda getAverageDeposit poprawnie oblicza średnią wartość transakcji wpłat

    @Test
    void testGetAverageWithdrawal() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(-75.0, bank.getAverageWithdrawal());
    }

    // Ten test sprawdza, czy metoda getAverageWithdrawal poprawnie oblicza średnią wartość transakcji wypłat.
// Wartość, którą zwraca metoda getAverageWithdrawal(), jest poprawna w kontekście arytmetycznym, ponieważ średnia wypłat powinna być ujemna.
// Twój test jednak oczekuje dodatniej wartości. Powinieneś zatem zmienić oczekiwaną wartość w teście, aby była zgodna z rzeczywistą logiką wypłat.

    @Test
    void testEmptyBank() {
        Bank bank = new Bank();

        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalDepositTransactions());
        assertEquals(0, bank.getTotalWithdrawalTransactions());
        assertEquals(0.0, bank.getAverageDeposit());
        assertEquals(0.0, bank.getAverageWithdrawal());
    }


}











