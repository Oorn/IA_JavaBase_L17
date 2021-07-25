package com.company;

public class Laptop implements Computer{
    @Override
    public String thisIs() {
        return "this is a Laptop " + this;
    }
}
