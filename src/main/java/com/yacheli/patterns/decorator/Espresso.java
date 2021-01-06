package com.yacheli.patterns.decorator;

public class Espresso extends Beverage{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
