package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void testStudentsWithAssignedTeachers() {
        // given
        List<Student> students = List.of(
                new Student("Ann Adams", new Teacher("Jan Janowski")),
                new Student("Cecylia Cymes", new Teacher("Henryk Kalinowski"))
        );
        // when
        List<String> results = Application.generateResults(students);
        // then
        List<String> expectedResults = List.of(
                "uczeń: Ann Adams, nauczyciel: Jan Janowski",
                "uczeń: Cecylia Cymes, nauczyciel: Henryk Kalinowski"
        );

        assertEquals(expectedResults, results);
    }

    @Test
    public void testStudentsWithoutAssignedTeachers() {
        // given
        List<Student> students = List.of(
                new Student("Barbara Barold", null),
                new Student("Krzysztof Makowski", null)
        );
        // when
        List<String> results = Application.generateResults(students);
        // then
        List<String> expectedResults = List.of(
                "uczeń: Barbara Barold, nauczyciel: <undefined>",
                "uczeń: Krzysztof Makowski, nauczyciel: <undefined>"
        );

        assertEquals(expectedResults, results);
    }

    @Test
    public void testMixedTeacherAssignments() {
        //  given
        List<Student> students = List.of(
                new Student("Barbara Barold", null),
                new Student("Cecylia Cymes", new Teacher("Henryk Kalinowski")),
                new Student("Dagmara Denar", new Teacher("Alicja Malinowska"))
        );
        // when
        List<String> results = Application.generateResults(students);
        //  then
        List<String> expectedResults = List.of(
                "uczeń: Barbara Barold, nauczyciel: <undefined>",
                "uczeń: Cecylia Cymes, nauczyciel: Henryk Kalinowski",
                "uczeń: Dagmara Denar, nauczyciel: Alicja Malinowska"
        );

        assertEquals(expectedResults, results);
    }
}


// test poprawnych danych (nauczyciel przypisany)
// test danych w przypadku braku nauczyciela (<undefined>)
// test kombinacji danych (z nauczycielami i bez)