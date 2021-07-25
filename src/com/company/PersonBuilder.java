package com.company;

public class PersonBuilder {
    String name;
    String surname;
    int birthYear;

    static final int NAME = 1;
    static final int SURNAME = 2;
    static final int BIRTH_YEAR = 3;

    PersonBuilder() {
        name = "";
        surname = "";
        birthYear = 0;
    }
    public PersonBuilder(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    void setField(int field, String value) {
        switch (field) {
            case NAME:
                name = value;
                break;
            case SURNAME:
                surname = value;
                break;
            case BIRTH_YEAR:
                birthYear = Integer.parseInt(value);
                break;
        }
    }
    Person getPerson() {
        return new Person(name, surname, birthYear);
    }
}
