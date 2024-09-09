package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {      // zarządza subskrypcjami klientów do lokalizacji oraz wysyłaniem powiadomień.

    private Map<Location, Set<Client>> subscriptions = new HashMap<>();

    public void subscribe(Client client, Location location) {
        Set<Client> clients = this.subscriptions.get(location);
        if (clients != null) {
            clients.add(client);
        } else {
            Set<Client> temp = new HashSet<>();
            temp.add(client);
            subscriptions.put(location, temp);
        }
    }


//    public void subscribe(Client client, Location location) {
//        this.subscriptions.computeIfAbsent(location, k -> new HashSet<>()).add(client);
//    }


    public void unsubscribe(Client client, Location location) {
        Set<Client> clients = this.subscriptions.get(location);
        if (clients != null) {
            clients.remove(client);
            if (clients.isEmpty()) {
                this.subscriptions.remove(location);
            }
        }
    }

    public void unsubscribeFromAllLocations(Client client) {
        this.subscriptions.values().forEach(clients -> clients.remove(client));
        this.subscriptions.entrySet().removeIf(entry -> entry.getValue().isEmpty());
    }

    public void sendWeatherAlertToLocation(WeatherAlert weatherAlert, Location location) {
        Set<Client> clients = this.subscriptions.get(location);
        if (clients != null) {
            clients.forEach(client -> client.receive(weatherAlert));
        }
    }

    public void sendWeatherAlertToAll(WeatherAlert weatherAlert) {
        Set<Client> notifiedClients = new HashSet<>();  // zbiór klientów, którym już wysłano alert, Set nie pozwala na duplikaty
        for (Set<Client> clients : subscriptions.values()) {    // iteracja po wszystkich lokalizacjach
            for (Client client : clients) {                     // iteracja po każdym kliencie w zestawie
                if (!notifiedClients.contains(client)) {    // sprawdź czy klient już nie otrzymał alertu, ('!' - negacja)
                    client.receive(weatherAlert);           // wyślij alert
                    notifiedClients.add(client);            // dodaj klienta do zbioru, aby uniknąć duplikacji
                }
            }
        }
    }

    public void removeLocation(Location location) {
        this.subscriptions.remove(location);
    }
}

 /*

 values() - zwraca kolekcję zbiorów subskrybentów
 pierwsze forEach iteruje przez każdy zbiór subskrybentów Set<Client> (dla każdej lokalizacji istnieje oddzielny zbiór subskrybentów),
 drugie forEach iteruje przez każdego klienta Client w danym zbiorze
 i wywołuje metodę receive(weatherAlert) na każdym kliencie, przekazując powiadomienie (weatherAlert)
 -----------------------------------------------------------------------------------------------------
* subscribe(Client client, Location location): Dodaje klienta do lokalizacji. Jeśli lokalizacja nie istnieje, jest tworzona nowa.
* unsubscribe(Client client, Location location): Usuwa klienta z lokalizacji. Jeśli lokalizacja staje się pusta, jest usuwana.
* unsubscribeFromAllLocations(Client client): Usuwa klienta ze wszystkich lokalizacji, z których jest subskrybowany.
* sendWeatherAlertToLocation(WeatherAlert weatherAlert, Location location): Wysyła powiadomienie do wszystkich subskrybentów danej lokalizacji.
* sendWeatherAlertToAll(WeatherAlert weatherAlert): Wysyła powiadomienie do wszystkich subskrybentów we wszystkich lokalizacjach.
* removeLocation(Location location): Usuwa lokalizację oraz jej subskrybentów.

  */














