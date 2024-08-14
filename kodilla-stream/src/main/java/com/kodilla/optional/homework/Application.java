package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = List.of(       // List.of() - niemodyfikowalna lista
                new Student("Ann Adams", new Teacher("Jan Janowski")),
                new Student("Barbara Barold", null),
                new Student("Cecylia Cymes", new Teacher("Henryk Kalinowski")),
                new Student("Dagmara Denar", new Teacher("Alicja Malinowska")),
                new Student("Edward Santorski", new Teacher("Karol Krasowski")),
                new Student("Krzysztof Makowski", null)
        );

        for (Student student : students) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";
                            //         warunek ternarny  ?     wartość_jeśli_true          :   wartość_jeśli_false;

        System.out.println("uczeń: " + student.getName() + ", " + "nauczyciel: " + teacherName);
        }
    }

    public static List<String> generateResults(List<Student> students) {
        List<String> results = new ArrayList<>();

        for (Student student : students) {

            // sprawdzenie czy nauczyciel nie jest null
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            //  Sprawdzanie, czy nauczyciel jest obecny i pobieranie jego nazwy, jeśli nie używamy <undefined>
            String teacherName = optionalTeacher.isPresent() ? optionalTeacher.get().getName() : "<undefined>";
            // Dodanie wyników do listy
            results.add("uczeń: " + student.getName() + ", " + "nauczyciel: " + teacherName);
        }

        return results;
    }
}














