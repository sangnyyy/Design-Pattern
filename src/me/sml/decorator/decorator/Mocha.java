package me.sml.decorator.decorator;

import me.sml.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mocha";
    }

    @Override
    public int cost() {
        return super.cost() + 200;
    }
}
