package com.yacheli.patterns.decorator;

public class DarkRoast extends Beverage{
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 0;
    }
}
