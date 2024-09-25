package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

class AnimalFactoryTestSuite {

    @Test
    public void shouldCreateDogBeanAndFetchByBeanName() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = (Dog) context.getBean("createDog"); // Pobierając beana po nazwie, zawsze otrzymujemy typ Object.
        // When                                             // Należy wskazać jak ma być traktowany obiekt: czy ma być to np. Animal, czy Dog.
        String voice = dog.getVoice();
        // Then
        Assertions.assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        // When
        String voice = animal.getVoice();
        System.out.println(voice);
        // Then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }

}
// Zasada działania testu jest taka sama, jak w poprzednich przypadkach:
// pobieramy context Springowy, wyszukujemy beana, wywołujemy metodę
// i porównujemy wynik z oczekiwanym rezultatem.


