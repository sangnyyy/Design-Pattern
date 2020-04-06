package me.sml.factory;

import me.sml.factory.ingredient.Dough;
import me.sml.factory.ingredient.NYDough;
import me.sml.factory.ingredient.NYSauce;
import me.sml.factory.ingredient.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough makeDough() {
        return new NYDough();
    }

    @Override
    public Sauce makeSauce() {
        return new NYSauce();
    }
}
