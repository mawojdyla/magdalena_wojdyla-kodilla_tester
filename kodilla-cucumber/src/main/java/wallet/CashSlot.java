package wallet;

public class CashSlot {     // reprezentuje urządzenie, które wydaje gotówkę
    private int contents;           // przechowuje kwotę, która została wypłacona

    public int getContents() {      // zwraca kwotę przechowywaną w contents, czyli ostatnio wydaną kwotę
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }       // ustawia wartość contents na wypłacaną kwotę
}
