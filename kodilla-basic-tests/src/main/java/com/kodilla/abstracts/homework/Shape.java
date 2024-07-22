package com.kodilla.abstracts.homework;

public abstract class Shape {       //  nie ma konstruktora, ponieważ nie ma żadnych pól do ininicjalizacji

    public abstract double area();

    public abstract double perimeter();
}




//  Każda klasa dziedzicząca implementuje te metody (area, perimeter) zgodnie ze specyfiką swojego kształtu.
//
// 'super' nie jest potrzebne, ponieważ klasa Shape nie zawiera pól,
// które musiałyby być inicjalizowane w konstruktorze klas pochodnych.
// Każda klasa dziedzicząca po Shape ma swoje własne pola i implementacje metod.

//Klasa ABSTRAKCYJNA Shape DEFINIUJE WSPÓLNY INTERFEJS (zestaw metod) dla wszystkich kształtów.
// Każdy kształt musi mieć metodę area() i perimeter(), ale sposób ich implementacji
// będzie się różnił w zależności od kształtu.

//Definiując te metody jako abstrakcyjne w klasie Shape,
// zmuszasz wszystkie podklasy do ich implementacji, zapewniając,
// że każda podklasa będzie miała te metody.

// Polimorfizm pozwala na traktowanie obiektów różnych klas w jednolity sposób
