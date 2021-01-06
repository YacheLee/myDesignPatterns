package com.yacheli.patterns.decorator;

public class Mocha extends Beverage{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha("+this.getSize()+")";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.2;
    }
}
