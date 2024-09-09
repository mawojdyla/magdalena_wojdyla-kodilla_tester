package com.kodilla.mockito.homework;

import com.kodilla.mockito.MobilePhone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }
    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());    // testujemy domyślne zachowanie
        Mockito.when(myPhone.needsCharging()).thenReturn(true); // jeśli zostanie wywołana metoda 'needsCharging()' z obiektu 'myPhone', zwróć 'true' jako wynik działania tej metody
        Assertions.assertTrue(myPhone.needsCharging());
    }
    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }

}
