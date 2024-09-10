package com.kodilla.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }


public List<Order> getListOfOrdersFromRangeOfTwoDates(LocalDate startDate, LocalDate endDate) {
    List<Order> selectedOrders = new ArrayList<>();
    for (Order order : orders) {
        LocalDate orderDate = order.getDate();
        if ((orderDate.isEqual(startDate) || orderDate.isAfter(startDate)) &&
                (orderDate.isEqual(endDate) || orderDate.isBefore(endDate))) {
            selectedOrders.add(order);
        }
    }
    return selectedOrders;
}

public List<Order> getListOfOrdersFromIndicatedRange(double minValue, double maxValue) {
    List<Order> selectedOrders = new ArrayList<>();
    for (Order order : orders) {
        if (order.getValue() >= minValue && order.getValue() <= maxValue) {
            selectedOrders.add(order);
        }
    }
    return selectedOrders;
}

public int getSizeOfOrders() {
    return orders.size();
}

public double getSumOfAllOrders() {
    double sum = 0;
    for (Order order : orders) {
        sum += order.getValue();
    }
    return sum;
}

}

/*

1. Dodanie nowych zamówień (jedno lub więcej) i sprawdzenie rozmiaru listy w Shop
2. Dodanie kilku zamówień i sprawdzenie poprawności danych (double value, LocalDate date, String user) jednego z zamówień
3. Zwrócenie listy zamówień z zakresu dwóch dat, poza zakresem (np. 1000)- zwraca pustą listę i dokładne granice
6. Wyczyszczenie zamówień w sklepie, dodanie kilku zamówień, a następnie clear(), lista powinna być pusta
7. Pobranie zamówień w zakresie wartości, poza zakresem i dokładne granice
8. Zsumowanie wartości wszystkich zamówień, dodanie kilku zamówień, dodanie i usunięcie, sprawdzenie pustej listygfr


 */
