package com.company;

public class Smartphone implements Computer{
    @Override
    public String thisIs() {
        return "this is a Smartphone " + this;
    }
}
