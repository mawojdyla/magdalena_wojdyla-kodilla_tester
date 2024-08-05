package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;     // tablica przechowująca bankomaty
    private int size;           // śledzi liczbę bankomatów

    public Bank() {
        this.cashMachines = new CashMachine[0]; //   inicjalizacja pustej tablicy
        this.size = 0;
    }

    // metoda do dodawania bankomatów do tablicy
    public void addCashMachine(CashMachine cashMachine) {   // '(CashMachine cashMachine)' parametr typu 'CashMachine' ze zmienną tego argumentu 'cashmachine'
        this.size++;
        CashMachine[] newCashMachines = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, cashMachines.length);
        newCashMachines[this.size - 1] = cashMachine;
        this.cashMachines = newCashMachines;
    }

    public int getTotalBalance() {       // oblicza całkowity balans wsyztskich bankomatów, sumując wszytskie salda
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {  // for (int i = 0; i < cashMachines.length; i++) { totalBalance += cashMachines[i].getBalance(); }
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getTotalDepositTransactions() {      // oblicza liczbę wpłat we wsyztskich bankomatach
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getTotalWithdrawalTransactions() {       // oblicza transakcje wypłat
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.getTotalWithdrawalTransactions();
        }
        return count;
    }


    public double getAverageDeposit() {         // oblicza średnią wpłat we wszytskich bankomatach
        int sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        if (count == 0) {           //    Jeśli liczba wpłat wynosi 0, zwraca 0, aby uniknąć dzielenia przez zero.
            return 0;
        } else {
            return (double) sum / count;
        }
    }

    public double getAverageWithdrawal() {          // średnia wypłat
        int sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        if (count == 0) {               // skrótowy zapis : "count == 0 ? 0 : (double) sum / count;"
            return 0;
        } else {
            return (double) sum / count;    // Math.abs(sum/count) <-- daje wartość bezwględną
        }

    }

}

// count == 0 ? 0 : (double) sum / count;