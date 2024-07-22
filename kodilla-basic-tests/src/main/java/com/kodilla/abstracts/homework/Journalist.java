package com.kodilla.abstracts.homework;

public class Journalist extends Job {
    public Journalist(double salary) {
        super(salary, new String[]{"Writing articles", "Conducting interviews", "Researching information", "Reporting live events"});
    }
}

// Metoda super() w konstruktorze klasy dziedziczącej służy do wywołania konstruktora klasy bazowej.
// Dzięki temu możemy przekazać parametry z klasy dziedziczącej do klasy bazowej i zainicjalizować pola klasy bazowej.