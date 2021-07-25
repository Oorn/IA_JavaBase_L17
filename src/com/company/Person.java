package com.company;

public class Person {
    final String name;
    final String surname;
    final int birthYear;

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    public String toString() {
        return name + " " + surname + " " + birthYear;
    }
}
