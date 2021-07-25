package com.company;

public class SmartphoneCreator implements ComputerCreator{
    @Override
    public Smartphone create() {
        return new Smartphone();
    }
}
