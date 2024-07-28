package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double dimensions;
    private boolean isStamped;

    public Stamp(String name, double dimensions, boolean isStamped) {
        this.name = name;
        this.dimensions = dimensions;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public double getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(dimensions, stamp.dimensions) == 0 && isStamped == stamp.isStamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions=" + dimensions +
                ", isStamped=" + isStamped +
                '}';
    }
}
