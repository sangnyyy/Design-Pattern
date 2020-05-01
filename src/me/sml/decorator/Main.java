package me.sml.decorator;

import me.sml.decorator.beverage.Beverage;
import me.sml.decorator.beverage.Decaf;
import me.sml.decorator.beverage.Espresso;
import me.sml.decorator.decorator.Milk;
import me.sml.decorator.decorator.Mocha;

public class Main {

    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription());
        System.out.println(decaf.cost());

        decaf = new Milk(decaf);
        System.out.println(decaf.getDescription());
        System.out.println(decaf.cost());

        decaf = new Milk(decaf);
        System.out.println(decaf.getDescription());
        System.out.println(decaf.cost());

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        espresso = new Milk(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

    }
}
