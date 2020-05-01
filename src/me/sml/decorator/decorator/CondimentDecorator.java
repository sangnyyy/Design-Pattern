package me.sml.decorator.decorator;

import me.sml.decorator.beverage.Beverage;

public class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public int cost() {
        return beverage.cost();
    }
}
