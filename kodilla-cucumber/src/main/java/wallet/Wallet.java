package wallet;

public class Wallet {
    private int balance = 0;
    private String message;

    public Wallet() {
    }

    public void deposit(int money) {    // dodaje określoną kwotę do salda
        this.balance += money;
    }

    public int getBalance() {       // zwraca obecne saldo portfela
        return balance;
    }

    public void debit(int money) {
        if (money > balance) {
            message = "Not enough money in the wallet";
        } else {
            this.balance -= money;
        }
    }

    public String getMessage() {
        return message;
    }

}
