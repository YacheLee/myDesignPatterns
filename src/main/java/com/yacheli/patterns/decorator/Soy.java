package com.yacheli.patterns.decorator;

public class Soy extends Beverage{
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy("+this.getSize()+")";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.2;
    }
}
