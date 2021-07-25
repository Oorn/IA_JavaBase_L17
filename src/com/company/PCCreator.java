package com.company;

public class PCCreator implements ComputerCreator{
    @Override
    public PC create() {
        return new PC();
    }
}
