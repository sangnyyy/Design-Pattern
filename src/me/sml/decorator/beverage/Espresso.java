package me.sml.decorator.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "espresso";
    }

    @Override
    public int cost() {
        return 1200;
    }
}
