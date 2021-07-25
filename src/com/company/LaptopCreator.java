package com.company;

public class LaptopCreator implements ComputerCreator{
    @Override
    public Laptop create() {
        return new Laptop();
    }
}
