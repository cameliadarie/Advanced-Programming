package com.company;

public class School implements Comparable<School> {

    String nume;
    int capacity;

    public School(String nume, int capacity) {
        this.nume = nume;
        this.capacity = capacity;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(School o) {
        return this.nume.compareTo(o.nume);
    }
}
