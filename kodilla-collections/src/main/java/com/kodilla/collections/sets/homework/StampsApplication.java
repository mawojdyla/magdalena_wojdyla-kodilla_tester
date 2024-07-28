package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("A", 4.3, true));
        stamps.add(new Stamp("B", 3.9, true));
        stamps.add(new Stamp("C", 9, false));
        stamps.add(new Stamp("C", 9, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
