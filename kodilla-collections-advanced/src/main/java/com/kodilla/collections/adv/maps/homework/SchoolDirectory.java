package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        School firstSchool = new School(Arrays.asList(25, 26, 25, 28, 30), "Elementary School No. 1");
        School secondSchool = new School(Arrays.asList(26, 29, 27, 27, 25), "Elementary School No. 2");
        School thirdSchool = new School(Arrays.asList(30, 25, 26, 30, 28), "Elementary School No. 3");
//        List<Integer> numbers = Arrays.asList(25, 26, 25, 28, 30);

        Principal firstPrincipal = new Principal("Jan", "Nowak");
        Principal secondPrincipal = new Principal("Adam", "Kowalski");
        Principal thirdPrincipal = new Principal("Karol", "Nowakowski");

        schoolMap.put(firstPrincipal, firstSchool); // przypisuję szkoły do dyrektorów
        schoolMap.put(secondPrincipal, secondSchool);
        schoolMap.put(thirdPrincipal, thirdSchool);

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            System.out.println("Principal: " + entry.getKey() + " Name of school: " + entry.getValue().getName() +  " Total number of students: " + entry.getValue().getTotalNumberOfStudents());
        }
    }
}
