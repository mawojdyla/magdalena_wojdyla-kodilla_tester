package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades) {
        this.grades = grades;
    }


    public double getAverage() {
        double sum = 0.0;
        for (double grade : grades)
            sum += grade;
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }
}

/*
for (double grade : grades)
Pętla ta iteruje (przebiega) po kolejnych elementach
zapisanych w kolekcji grades. Każdy z elementów tej kolekcji jest kolejno pobierany
 i wstawiany do zmiennej grade (typu double).
 */