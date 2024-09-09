package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class WeatherAlertServiceTestSuite {

    private WeatherAlertService weatherAlertService;
    private Client client1;
    private Client client2;
    private Location location1;
    private Location location2;
    private WeatherAlert weatherAlert;

    @BeforeEach
    public void setUp() {
        weatherAlertService = new WeatherAlertService();
        client1 = Mockito.mock(Client.class);
        client2 = Mockito.mock(Client.class);
        location1 = new Location("Location1");
        location2 = new Location("Location2");
        weatherAlert = Mockito.mock(WeatherAlert.class);
    }

    @Test
    public void shouldSubscribeClientToLocation() {

        weatherAlertService.subscribe(client1, location1);

        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, location1);

        verify(client1, times(1)).receive(weatherAlert);
    }

    @Test
    public void shouldNotSendWeatherAlertToUnsubscribedClient() {

        weatherAlertService.subscribe(client1, location1);

        weatherAlertService.unsubscribe(client1, location1);

        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, location1);

        verify(client1, never()).receive(weatherAlert);

    }

    @Test
    public void shouldUnsubscribeClientFromAllLocations() {

        weatherAlertService.subscribe(client1, location1);
        weatherAlertService.subscribe(client2, location2);

        weatherAlertService.unsubscribeFromAllLocations(client1);

        weatherAlertService.sendWeatherAlertToAll(weatherAlert);

        verify(client1, never()).receive(weatherAlert);
    }

    @Test
    public void shouldReceiveOneAlertIfAddedToLocations() {

        weatherAlertService.subscribe(client1, location1);
        weatherAlertService.subscribe(client1, location2);

        weatherAlertService.sendWeatherAlertToAll(weatherAlert);

        verify(client1, times(1)).receive(weatherAlert);
    }

    @Test
    public void shouldSendWeatherAlertToAllClients() {

        weatherAlertService.subscribe(client1, location1);
        weatherAlertService.subscribe(client2, location2);

        weatherAlertService.sendWeatherAlertToAll(weatherAlert);

        verify(client1, times(1)).receive(weatherAlert);
        verify(client2, times(1)).receive(weatherAlert);
    }

    @Test
    public void shouldRemoveLocation() {

        weatherAlertService.subscribe(client1, location1);

        weatherAlertService.removeLocation(location1);

        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, location1);

        verify(client1, never()).receive(weatherAlert);
    }

    @Test
    public void shouldNotThrowExceptionWhenUnsubscribingFromNonExistingLocation() {
        // given
        Location nonExistingLocation = new Location("NonExistingLocation");
        weatherAlertService.subscribe(client1, location1);

        // when
        weatherAlertService.unsubscribe(client1, nonExistingLocation);

        // then
        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, location1);
        verify(client1, times(1)).receive(weatherAlert);
    }

    @Test
    public void shouldNotSendAlertToNonExistingLocation() {
        // given
        Location nonExistingLocation = new Location("NonExistingLocation");
        weatherAlertService.subscribe(client1, location1);

        // when
        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, nonExistingLocation);

        // then
        verify(client1, never()).receive(weatherAlert);
    }

    @Test
    public void shouldNotAffectSubscriptionsWhenRemovingUnknownLocation() {
        // given
        weatherAlertService.subscribe(client1, location1);

        // when
        weatherAlertService.removeLocation(new Location("NonExistingLocation"));

        // then
        weatherAlertService.sendWeatherAlertToLocation(weatherAlert, location1);
        verify(client1, times(1)).receive(weatherAlert);
    }
}


/*

* shouldNotThrowExceptionWhenUnsubscribingFromNonExistingLocation() - Subskrypcja klienta do lokalizacji,
  a następnie próba wypisania klienta z lokalizacji, której nie ma.
* shouldNotSendAlertToNonExistingLocation() - Wysyłanie powiadomień do lokalizacji, której nie ma.
* shouldNotAffectSubscriptionsWhenRemovingUnknownLocation - Usuwanie lokalizacji, która nie istnieje w zbiorze

 */







