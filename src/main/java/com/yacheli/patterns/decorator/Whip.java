package com.yacheli.patterns.decorator;

public class Whip extends Beverage{
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip("+this.getSize()+")";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.1;
    }
}
