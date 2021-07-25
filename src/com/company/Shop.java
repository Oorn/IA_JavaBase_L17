package com.company;

public class Shop {
    Computer orderAndPurchaseGood (ComputerCreator creator) {
        return creator.create();
    }
}
