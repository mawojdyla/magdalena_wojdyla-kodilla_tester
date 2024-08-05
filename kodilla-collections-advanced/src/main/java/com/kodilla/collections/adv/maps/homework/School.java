package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudentsInClasses = new ArrayList<>();
    private String name;

    public School(List<Integer> numberOfStudentsInClasses, String name) {
        this.numberOfStudentsInClasses = numberOfStudentsInClasses;
        this.name = name;
    }

    public int getTotalNumberOfStudents() {
        int sum = 0;
        for (int student : numberOfStudentsInClasses)
            sum += student;
        return sum;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudentsInClasses=" + numberOfStudentsInClasses +
                '}';
    }
}
