package me.sml.decorator.decorator;

import me.sml.decorator.beverage.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
