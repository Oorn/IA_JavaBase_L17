package com.company;

public class PC implements Computer{
    @Override
    public String thisIs() {
        return "this is a PC " + this;
    }
}
