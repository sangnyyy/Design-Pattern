package me.sml.decorator.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "decaf";
    }

    @Override
    public int cost() {
        return 1000;
    }
}
